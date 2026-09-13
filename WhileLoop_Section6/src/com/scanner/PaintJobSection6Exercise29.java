package com.scanner;

public class PaintJobSection6Exercise29 {

	public static void main(String[] args) {
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		System.out.println(getBucketCount(-3.26, 0.75));
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		int numberOfBuckets = 0;
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}

		double area = width * height;
		numberOfBuckets = (int) Math.ceil(area / areaPerBucket);
		numberOfBuckets -= extraBuckets;

		return numberOfBuckets;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		int numberOfBuckets = 0;
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double area = width * height;
		double buckets = Math.ceil(area / areaPerBucket);
		numberOfBuckets = (int) buckets;

		return numberOfBuckets;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		int numberOfBuckets = 0;

		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double buckets = Math.ceil(area / areaPerBucket);
		numberOfBuckets = (int) buckets;
		return numberOfBuckets;
	}

}
