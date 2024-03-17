import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/*
 * This is a class that represents a picture. It inherits from the SimplePicture class.
 * @author Barbara Ericson ericson@cc.gatech.edu
 * edited by Ms. Thompson, January 2019
 */

public class Picture extends SimplePicture {
	// constructor that uses a file name
	public Picture(String fileName) {
		// sends the fileName to the parent class, which is Simple Picture
		super(fileName);
	}

	// constructor that uses a height and width
	public Picture(int height, int width) {
		// sends the height and width to the parent class, which is Simple Picture
		super(width, height);
	}

	// returns a string with info about this picture
	public String toString() {
		String output = "Picture, filename " + getFileName() +
				" height " + getHeight()
				+ " width " + getWidth();
		return output;

	}

	// remove all blue color from each pixel
	public void zeroBlue() {
		Pixel[][] grid = getPixels2D();

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				grid[r][c].setBlue(0);
			}
		}
	}

	// remove all red and green color from each pixel
	public void keepOnlyBlue() {
		Pixel[][] grid = getPixels2D();

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				grid[r][c].setRed(0);
				grid[r][c].setGreen(0);
			}
		}
	}

	/*
	 * Invert the red, green and blue value of each pixel
	 * Do this by subtracting the current value from 255
	 * Example: if current red value is 30, the negated red value is 255-30 = 225
	 */
	public void negate() {
		Pixel[][] grid = getPixels2D();

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				grid[r][c].setRed(255 - grid[r][c].getRed());
				grid[r][c].setGreen(255 - grid[r][c].getGreen());
				grid[r][c].setBlue(255 - grid[r][c].getBlue());
			}
		}
	}

	/*
	 * create a black and white image by setting all pixels to a shade of gray
	 * do this by setting the red, green and blue to be the AVERAGE of all three
	 * Example: if R = 40, G = 60, and B = 100, then the average = 50
	 * so set R = 50, G = 50, and B = 50
	 */
	public void grayscale() {
		Pixel[][] grid = getPixels2D();

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				int value = (grid[r][c].getRed() + grid[r][c].getGreen() + grid[r][c].getBlue()) / 3;
				grid[r][c].setRed(value);
				grid[r][c].setGreen(value);
				grid[r][c].setBlue(value);
			}
		}
	}

	// mirror an image by copying the LEFT half of the picture onto the RIGHT half
	public void mirrorVertical() {
		Pixel[][] grid = getPixels2D();

		for (int r = 0; r < grid.length; r++) {
			int counter = 1;
			for (int c = grid[r].length / 2; c < grid[r].length; c++) {
				grid[r][c].setColor(grid[r][(grid[r].length / 2) - counter].getColor());
				counter++;
			}
		}
	}

	// mirror an image by copying the TOP half of the picture onto the BOTTOM half
	public void mirrorHorizontal() {
		Pixel[][] grid = getPixels2D();

		int counter = 1;
		for (int r = grid.length / 2; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				grid[r][c].setColor(grid[(grid.length / 2) - counter][c].getColor());
			}
			counter++;
		}
	}

	// The diagonal line from top left corner to bottom right corner is the "mirror"
	// Copy the BOTTOM LEFT triangle onto the TOP RIGHT triangle
	public void mirrorDiagonal() {
		Pixel[][] grid = getPixels2D();
		for (int r = 0; r < grid.length; r++)
			for (int c = 0; c < grid[0].length; c++) {
				if (r < grid[0].length && c < grid.length) {
					grid[r][c].setColor(grid[c][r].getColor());
				}
			}
	}

	/*-------------------EXTENSIONS-------------------*/

	// Mirror just one section of a picture over itself. This completed code
	// works using the "temple" photo. Modify the mirrorpoint and start/end values
	// to
	// mirror a section of any other picture you'd like.
	public void mirrorSection() {
		int mirrorPoint = 426; // the column that you want to "reflect" over

		int count = 0;

		Pixel[][] pixels = this.getPixels2D();

		// loop through all the rows that you want to mirror
		for (int row = 372; row < 611; row++) {
			// loop from starting column up to the mirrorPoint
			for (int col = 312; col < mirrorPoint; col++) {
				Pixel leftPixel = pixels[row][col];
				// rightPixel is the corresponding pixel on the other side of mirrorPoint
				Pixel rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	// show large changes in color by setting pixels as black or white
	// use the "colorDistance" method in Pixel class to see how "far apart" colors
	// are
	// if colorDistance > edgeDist, set to black
	public void edgeDetection(int edgeDist) {

	}

	// set larger squares of pixels to be the average of their colors
	// this produces a "pixelated" effect
	// factor is the size of the new pixelated squares
	public void pixelate(int factor) {

	}

	// replace sections of one photo, such as the background, with
	// pixels from another photo
	public void greenScreen() {

	}

	// choose only one color to keep in the photo
	// turn everything else grayscale
	public void colorPop() {
		// keep red
		Pixel[][] grid = getPixels2D();
		for (int r = 0; r < grid.length; r++)
			for (int c = 0; c < grid[0].length; c++) {
				int value = (grid[r][c].getRed() + grid[r][c].getGreen() + grid[r][c].getBlue()) / 3;
				grid[r][c].setBlue(value);
				grid[r][c].setGreen(value);
			}
	}

	// produce a "wave" effect by taking one color and transferring it to
	// a pixel at another location in the grid. Use sine or cosine function
	// to produce output that follows a wave pattern
	public void wave() {

	}

	// copy a picture onto another picture (used to create a collage)
	// @param other is a picture that can be copied onto this picture
	// @param startRow is which row on this picture you want the copied picture to
	// start
	// @param startCol is which column this picture you want the copied picture to
	// start
	public void copy(Picture other, int startRow, int startCol) {
		Pixel[][] thisGrid = getPixels2D();
		Pixel[][] otherGrid = other.getPixels2D();
		for (int otherRow = 0, thisRow = startRow; otherRow < otherGrid.length
				&& thisRow < thisGrid.length; otherRow++, thisRow++) {
			for (int otherCol = 0, thisCol = startCol; otherCol < otherGrid[0].length
					&& thisCol < thisGrid[0].length; otherCol++, thisCol++) {
				thisGrid[thisRow][thisCol].setColor(otherGrid[otherRow][otherCol].getColor());
			}
		}
	}

	public static void main(String[] args) {
		// Create a picture using the format:
		// Picture myPic = new Picture("fileName.jpg")
		Picture p1 = new Picture("images/thompson.jpg");
		// p1.zeroBlue();
		p1.negate();
		// display the image:
		p1.explore();
	}
}
