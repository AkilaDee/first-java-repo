class BMI{

    private double weight;
    private double height;
    private double bmi;

	public double getHeight() {
        	return height;
        }

   	public void setHeight(double height) {
         	this.height = height;
   	 }

    	public double getWeight() {
        	return weight;
   	 }

    	public void setWeight(double weight){
        	this.weight = weight;
    	}

    	public double getBmi(){
        	return bmi;
    	}

   	public void setBmi(double bmi){
        	this.bmi = bmi;
   	}

}
 
public class BmiCal {
	public static void main(String[] args){
        	BMI s1 = new BMI();
 
        	s1.setHeight(1.74);
       		s1.setWeight(68);
        	s1.setBmi(calculateBmi(s1));
        
        
       		System.out.println("The BMI is:  "+ s1.getBmi());

	}
    
    	public static double calculateBmi(BMI s1){
        	return s1.getWeight()/(s1.getHeight()*s1.getHeight()); 
    	}

}