
public class Faza {
int prawo;
int lewo;
boolean skret;
int tab[][];
int score[];


public Faza (int prawo, int lewo, boolean skret){
	this.prawo=prawo;
	this.lewo=lewo;
	this.skret=skret;
	tab=new int[91][2];
	score=new int[91];
	this.execute();
}

public void execute(){
	if (skret==false){
	for (int i=0; i<tab.length; i++){
		if (prawo>=i*1500/3600){ 
			tab[i][0]=i*1500/3600;
		}
		else tab[i][0]=tab[i-1][0];
		if (lewo>=i*1500/3600) {
			tab[i][1]=i*1500/3600;
		}
		else tab[i][1]=tab[i-1][1];
		
	}
	}
	else for (int i=0; i<tab.length; i++){
		if (prawo>=i*900/3600){
			tab[i][0]=i*900/3600;
		}
		else tab[i][0]=tab[i-1][0];
		if (lewo>=i*900/3600){
			tab[i][1]=i*900/3600;
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