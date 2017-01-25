
public class test {


	
	public static void main(String [ ] args){
		ParaDecision decision = new ParaDecision(2,12);
		ParaFaza pierwsza = new ParaFaza(1,1,12,1500,900,false);
		ParaFaza druga = new ParaFaza(3,0,12,1500,900,true);
		ParaFaza trzecia = new ParaFaza(3,1,12,1500,900,false);
		ParaFaza czwarta = new ParaFaza(2,2,12,1500,900,true);
		//pierwsza.prints();
		//druga.prints();
		trzecia.prints();
		//czwarta.prints();
		decision.combine(pierwsza,druga,false);
		//druga.prints();
		decision.combine(druga, trzecia,false);
		decision.combine(trzecia, czwarta,true);
		//decision.wypiszDecyzje();
		decision.finalDecision();
		System.out.println(decision.result());
		
		
		
		
		
		}
	}