
public class ParaDecision {
	int decisionTable[][];
	int finalDecision[];
	int counter=0;
	int decisionCounter;
	int minTime;
	int fullTime;
	int result;
	
	
	public ParaDecision(int minTime,int fullTime){
		this.minTime=minTime;     //8
		this.fullTime=fullTime;   //90
		decisionCounter=1;
		decisionTable=new int[fullTime+1][9];
		result=0;
	}
	
	public void combine(ParaFaza pierwsza, ParaFaza druga,boolean print){
		int score[]=new int[fullTime+1];
		for (int i=minTime*decisionCounter; i<pierwsza.score.length;i++){
			for (int j=minTime; j<druga.score.length;j++){
				if (i+j<=fullTime){
				if(pierwsza.score[i]+druga.score[j]>=score[i+j]){
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
		result=score[fullTime];
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
		finalDecision[3]=decisionTable[fullTime][8];
		for (int i=0; i<decisionTable.length; i++){
			if (decisionTable[i][3]==decisionTable[fullTime][7]){
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
		System.out.println();

	}
	public int result(){
		return result;
	}
}
