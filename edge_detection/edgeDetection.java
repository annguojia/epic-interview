package edge_detection;

public class edgeDetection {
/**
 * Two-dimensional array representation of an image can also be represented   
 * by a one-dimensional array of W*H size, where W represent row and H represent column   
 * size and each cell represent pixel value of that image. you are also given a threshold X.   
 * For edge detection, you have to compute difference of a pixel value with each of   
 * it's adjacent pixel and find maximum of all differences. And finally compare if   
 * that maximum difference is greater than threshold X. if so, then that pixel is   
 * a edge pixel and have to display it
 */
	public static void main(String args[]) {
		int[] image = {1, 3, 4, 5, 2, 4, 6, 2, 6, 7, 2, 5 };
		int threshold = 5;
		
		int[] output = processEdges(image, 3, 4, threshold);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		
	}
	public static int[] processEdges(int[] image, int row, int column, int threshold) {
		if (image == null) {
			return null;
		}
		if (image.length != row * column ) {
			return null;
		}
		
		int[] output = new int[image.length];
		int diff = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				boolean exceed = false;
				if (j - 1 >= 0) {
					diff = Math.abs(image[i * column + j] - image[i * column + j - 1]);
					if (diff >= threshold) {
						exceed = true;
					}
				}
				if (j + 1 < column) {
					diff = Math.abs(image[i * column + j + 1] - image[i * column + j]);
					if (diff >= threshold) {
						exceed = true;
					}
				}
				if (i - 1 >= 0) {
					diff = Math.abs(image[i * column - column + j] - image[i * column + j]);
					if (diff >= threshold) {
						exceed = true;
					}
				}
				if (i + 1 < row) {
					diff = Math.abs(image[i * column + column + j] - image[i * column + j]);
					if (diff >= threshold) {
						exceed = true;
					}
				}
				if (exceed) {
					output[i * column + j] = image[i * column + j];
				}
			}
		}
		
		return output;
	}

}
