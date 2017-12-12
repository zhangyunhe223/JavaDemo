package com.Chapter9.com;

public class MaxMin {
	/*
	 * 创建一个静态内部类Result 
	 * 在静态内部类中创建构造方法Result
	 * 再定义一个静态方法getResult()
	 */
	public static class Result {
		private double max;
		private double min;

		public Result(double max, double min) {
			// 使用构造方法进行初始化
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
