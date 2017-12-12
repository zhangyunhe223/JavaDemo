package com.Chapter9.com;

public class MaxMin {
	/*
	 * ����һ����̬�ڲ���Result 
	 * �ھ�̬�ڲ����д������췽��Result
	 * �ٶ���һ����̬����getResult()
	 */
	public static class Result {
		private double max;
		private double min;

		public Result(double max, double min) {
			// ʹ�ù��췽�����г�ʼ��
			this.max = max;
			this.min = min;
		}

		public double getMax() {
			return max;
		}

		public double getMin() {
			return min;
		}
		
		public static Result getResult(double[] array) {
			double max = Double.MIN_VALUE;
			double min = Double.MAX_VALUE;
			for (double i : array) {
				if (i > max) {
					max = i;
				}
				if (i < min) {
					min = i;
				}
			}
			return new Result(max, min);
		}
	}
}
