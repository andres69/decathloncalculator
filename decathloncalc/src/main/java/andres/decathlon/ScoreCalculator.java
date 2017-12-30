package andres.decathlon;

import andres.decathlon.model.ResultSheet;

public class ScoreCalculator {

	static final double HUNDRED_M_CONSTANT_A = 25.4347;
	static final double HUNDRED_M_CONSTANT_B = 18;
	static final double HUNDRED_M_CONSTANT_C = 1.81;
	static final double LONG_JUMP_CONSTANT_A = 0.14354;
	static final double LONG_JUMP_CONSTANT_B = 220;
	static final double LONG_JUMP_CONSTANT_C = 1.4;
	static final double SHOT_PUT_CONSTANT_A = 51.39;
	static final double SHOT_PUT_CONSTANT_B = 1.5;
	static final double SHOT_PUT_CONSTANT_C = 1.05;
	static final double HIGH_JUMP_CONSTANT_A = 0.8465;
	static final double HIGH_JUMP_CONSTANT_B = 75;
	static final double HIGH_JUMP_CONSTANT_C = 1.42;
	static final double FOUR_HUNDRED_M_CONSTANT_A = 1.53775;
	static final double FOUR_HUNDRED_M_CONSTANT_B = 82;
	static final double FOUR_HUNDRED_M_CONSTANT_C = 1.81;
	static final double HURDLES_CONSTANT_A = 5.74352;
	static final double HURDLES_CONSTANT_B = 28.5;
	static final double HURDLES_CONSTANT_C = 1.92;
	static final double DISCUS_THROW_CONSTANT_A = 12.91;
	static final double DISCUS_THROW_CONSTANT_B = 4;
	static final double DISCUS_THROW_CONSTANT_C = 1.1;
	static final double POLE_VAULT_CONSTANT_A = 0.2797;
	static final double POLE_VAULT_CONSTANT_B = 100;
	static final double POLE_VAULT_CONSTANT_C = 1.35;
	static final double JAVELIN_THROW_CONSTANT_A = 10.14;
	static final double JAVELIN_THROW_CONSTANT_B = 7;
	static final double JAVELIN_THROW_CONSTANT_C = 1.08;
	static final double ONE_THOUSAND_FIVE_HUNDRED_M_CONSTANT_A = 0.03768;
	static final double ONE_THOUSAND_FIVE_HUNDRED_M_CONSTANT_B = 480;
	static final double ONE_THOUSAND_FIVE_HUNDRED_M_CONSTANT_C = 1.85;
	
	public static int calculateScore(ResultSheet results) {
		int score = 0;
		score = calculateTrackEventScore(Double.parseDouble(results.getHundredMeterRun()), HUNDRED_M_CONSTANT_A, HUNDRED_M_CONSTANT_B, HUNDRED_M_CONSTANT_C);
		score += calculateFieldEventScore(Double.parseDouble(results.getLongJump()), LONG_JUMP_CONSTANT_A, LONG_JUMP_CONSTANT_B, LONG_JUMP_CONSTANT_C);
		score += calculateFieldEventScore(Double.parseDouble(results.getShotPut()), SHOT_PUT_CONSTANT_A, SHOT_PUT_CONSTANT_B, SHOT_PUT_CONSTANT_C);
		score += calculateFieldEventScore(Double.parseDouble(results.getHighJump()), HIGH_JUMP_CONSTANT_A, HIGH_JUMP_CONSTANT_B, HIGH_JUMP_CONSTANT_C);
		score += calculateTrackEventScore(Double.parseDouble(results.getFourHundredMeterRun()), FOUR_HUNDRED_M_CONSTANT_A, FOUR_HUNDRED_M_CONSTANT_B, FOUR_HUNDRED_M_CONSTANT_C);
		score += calculateTrackEventScore(Double.parseDouble(results.getHurdles()), HURDLES_CONSTANT_A, HURDLES_CONSTANT_B, HURDLES_CONSTANT_C);
		score += calculateFieldEventScore(Double.parseDouble(results.getDiscusThrow()), DISCUS_THROW_CONSTANT_A, DISCUS_THROW_CONSTANT_B, DISCUS_THROW_CONSTANT_C);
		score += calculateFieldEventScore(Double.parseDouble(results.getPoleVault()), POLE_VAULT_CONSTANT_A, POLE_VAULT_CONSTANT_B, POLE_VAULT_CONSTANT_C);
		score += calculateFieldEventScore(Double.parseDouble(results.getJavelinThrow()), JAVELIN_THROW_CONSTANT_A, JAVELIN_THROW_CONSTANT_B, JAVELIN_THROW_CONSTANT_C);
		score += calculateTrackEventScore(Double.parseDouble(results.getOneThousandFiveHundredMeterRun()), ONE_THOUSAND_FIVE_HUNDRED_M_CONSTANT_A, ONE_THOUSAND_FIVE_HUNDRED_M_CONSTANT_B, ONE_THOUSAND_FIVE_HUNDRED_M_CONSTANT_C);
		return score;
	}
	
	private static int calculateTrackEventScore(double result, double constantA, double constantB, double constantC) {
		double score = constantA * java.lang.Math.pow(constantB - result, constantC);
		return (int) score;
	}
	
	private static int calculateFieldEventScore(double result, double constantA, double constantB, double constantC) {
		double score = constantA * java.lang.Math.pow(result - constantB, constantC);
		return (int) score;
	}

}
