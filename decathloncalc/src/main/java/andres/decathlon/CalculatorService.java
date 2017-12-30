package andres.decathlon;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import andres.decathlon.model.ResultSheet;

@Path("/calculator")
public class CalculatorService {

	@POST
	@Produces(MediaType.TEXT_HTML)
    public String newTodo(@FormParam("id") String id,
            @FormParam("hundredMeterRun") String hundredMeterRun,
            @FormParam("longJump") String longJump,
            @FormParam("shotPut") String shotPut,
            @FormParam("highJump") String highJump,
            @FormParam("fourHundredMeterRun") String fourHundredMeterRun,
            @FormParam("hurdles") String hurdles,
            @FormParam("discusThrow") String discusThrow,
            @FormParam("poleVault") String poleVault,
            @FormParam("javelinThrow") String javelinThrow,
            @FormParam("oneThousandFiveHundredMeterRun") String oneThousandFiveHundredMeterRun,
            @Context HttpServletResponse servletResponse) throws IOException {
		ResultSheet resultSheet = new ResultSheet(hundredMeterRun, longJump, shotPut, highJump, fourHundredMeterRun, hurdles, discusThrow, 
				poleVault, javelinThrow, oneThousandFiveHundredMeterRun);
		resultSheet.setScore(String.valueOf(ScoreCalculator.calculateScore(resultSheet)));

        return "<html><title>Result score</title><body>Score based on results: " + resultSheet.getScore() +  "</body></html>";
    }


}