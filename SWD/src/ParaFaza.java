
public class ParaFaza {
	int prawo;
	int lewo;
	boolean skret;
	int tab[][];
	int score[];
	int przepustowoscProsto;
	int przepustowoscSkret;
	int max;


	public ParaFaza (int prawo, int lewo,int max, int przepustowoscProsto,int przepustowoscSkret, boolean skret){
		this.prawo=prawo;
		this.lewo=lewo;
		this.skret=skret;
		tab=new int[max+1][2];
		score=new int[max+1];
		this.przepustowoscProsto=przepustowoscProsto;
		this.przepustowoscSkret=przepustowoscSkret;
		this.execute();
	}

	public void execute(){
		if (skret==false){
		for (int i=0; i<tab.length; i++){
			if (prawo>=i*przepustowoscProsto/3600){ 
				tab[i][0]=i*przepustowoscProsto/3600;
			}
			else tab[i][0]=tab[i-1][0];
			if (lewo>=i*przepustowoscProsto/3600) {
				tab[i][1]=i*przepustowoscProsto/3600;
			}
			else tab[i][1]=tab[i-1][1];
			
		}
		}
		else for (int i=0; i<tab.length; i++){
			if (prawo>=i*przepustowoscSkret/3600){
				tab[i][0]=i*przepustowoscSkret/3600;
			}
			else tab[i][0]=tab[i-1][0];
			if (lewo>=i*przepustowoscSkret/3600){
				tab[i][1]=i*przepustowoscSkret/3600;
			}
			else tab[i][1]=tab[i-1][1];
		}
		add();
	}
	public void add(){
		for (int i=0; i<tab.length; i++){
			score[i]=tab[i][0]+tab[i][1];
		}
	}
	public void print(){
		for (int i=0; i<tab.length; i++) System.out.print(i+" "+tab[i][0]+" "+tab[i][1]+"\n");
	}
	public void prints(){
		for (int i=0; i<tab.length; i++) System.out.print(i+" "+score[i]+"\n");
	}
	}