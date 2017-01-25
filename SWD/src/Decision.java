
public class Decision {
	
	int decisionTable[][]=new int[91][9];
	int finalDecision[];
	int counter=0;
	int decisionCounter=1;
	
	
	
	
	
	public void combine(Faza pierwsza, Faza druga,boolean print){
		int score[]=new int[91];
		for (int i=8*decisionCounter; i<pierwsza.score.length;i++){
			for (int j=8; j<druga.score.length;j++){
				if (i+j<=90){
				if(pierwsza.score[i]+druga.score[j]>score[i+j]){
					score[i+j]=pierwsza.score[i]+druga.score[j];
					decisionTable[i+j][counter]=i+j;
					decisionTable[i+j][counter+1]=i;
					decisionTable[i+j][counter+2]=j;
					
				}
				}
			}
			}
		druga.score=score;
	if (print==true){
		System.out.println("suma");
		for (int i=0; i<score.length; i++) System.out.print(i+" samochody:"+score[i]+" decyzja1:"+decisionTable[i][counter+1]+" decyzja2:"+decisionTable[i][counter+2]+"\n" );
	}
		counter+=3;
		decisionCounter++;
	}
	public void combinePLUS(Faza pierwsza, Faza druga){
		int score[][]=new int[91][3];
		for (int i=0; i<pierwsza.score.length;i++){
			for (int j=0; j<druga.score.length;j++){
				if (i+j<=90){
				if(pierwsza.score[i]+druga.score[j]>score[i+j][0]){
					score[i+j][0]=pierwsza.score[i]+druga.score[j];
					score[i+j][1]=i;
					score[i+j][2]=j;
				}
				}
			
			}
		}
		System.out.print("suma");
		for (int i=0; i<score.length; i++) System.out.print(i+" "+score[i][0]+" "+score[i][1]+" "+score[i][2]+"\n");
	}
	public void wypiszDecyzje(){
		for (int i=0; i<decisionTable.length; i++){
		for (int j=0; j<decisionTable[i].length; j++){
			System.out.print(decisionTable[i][j]+" ");
			}
		System.out.println();
		}
	}
	public void finalDecision(){
		finalDecision= new int[4];
		finalDecision[3]=decisionTable[90][8];
		for (int i=0; i<decisionTable.length; i++){
			if (decisionTable[i][3]==decisionTable[90][7]){
				finalDecision[2]=decisionTable[i][5];
				finalDecision[1]=decisionTable[i][4];
		}	
		}
		for (int i=0; i<decisionTable.length; i++){
			if (decisionTable[i][0]==finalDecision[1]){
				finalDecision[1]=decisionTable[i][2];
				finalDecision[0]=decisionTable[i][1];		
			}
			
		}
		for (int i=0; i<finalDecision.length; i++) System.out.print(finalDecision[i]+" ");
		
		

	}
}
