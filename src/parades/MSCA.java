package parades;
import java.util.ArrayList;

public class MSCA implements MSCAInterface{


	public MSCA() {

		
	}


	public String lcs(char[] seqX, char[] seqY) {
		String[][] stringMatrix = new String[seqX.length][seqY.length];
		
		for (int i = 0; i < seqX.length; i++) {
			for (int j = 0; j < seqY.length; j++) {
				stringMatrix[i][j] = "";
				
			}
		}
		for (int i = 1; i < seqX.length; i++) {
			for (int j = 1; j < seqY.length; j++) {
				if(seqX[i] == seqY[j]) {
					stringMatrix[i][j] = stringMatrix[i-1][j-1] + seqX[i];
				}
				else if(stringMatrix[i-1][j].length() < stringMatrix[i][j-1].length()) {
					stringMatrix[i][j] = stringMatrix[i][j-1];
				}
				else if(stringMatrix[i-1][j].length() > stringMatrix[i][j-1].length()) {
					stringMatrix[i][j] = stringMatrix[i-1][j];
				}
				
				else {
					if(stringMatrix[i-1][j].compareTo(stringMatrix[i][j-1]) > 0)
						stringMatrix[i][j] = stringMatrix[i][j-1];
					else
						stringMatrix[i][j] = stringMatrix[i-1][j];
					
				}
			}
		}
		return stringMatrix[seqX.length-1][seqY.length-1];
		
	}

}
