package andres.decathlon.test;

import org.junit.Test;

import andres.decathlon.ScoreCalculator;
import andres.decathlon.model.ResultSheet;

import static org.junit.Assert.*;

public class ScoreCalculatorTest {

	static final String WORLD_RECORD_100M = "10.23";
	static final String WORLD_RECORD_LONG_JUMP = "788";
	static final String WORLD_RECORD_SHOT_PUT = "14.52";
	static final String WORLD_RECORD_HIGH_JUMP = "201";
	static final String WORLD_RECORD_400M = "45";
	static final String WORLD_RECORD_HURDLES = "13.69";
	static final String WORLD_RECORD_DISCUS_THROW = "43.34";
	static final String WORLD_RECORD_POLE_VAULT = "520";
	static final String WORLD_RECORD_JAVELIN_THROW = "63.63";
	static final String WORLD_RECORD_1500M = "257.52";
	
	static final int WORLD_RECORD_SCORE = 9045;
	
	@Test
    public void testCalculator() {
		ResultSheet worldRecordResults = new ResultSheet(WORLD_RECORD_100M, WORLD_RECORD_LONG_JUMP, WORLD_RECORD_SHOT_PUT, WORLD_RECORD_HIGH_JUMP, WORLD_RECORD_400M, 
				WORLD_RECORD_HURDLES, WORLD_RECORD_DISCUS_THROW, WORLD_RECORD_POLE_VAULT, WORLD_RECORD_JAVELIN_THROW, WORLD_RECORD_1500M);
		int score = ScoreCalculator.calculateScore(worldRecordResults);
        assertEquals(WORLD_RECORD_SCORE, score);
	}
	
}
