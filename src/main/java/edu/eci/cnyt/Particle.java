
package edu.eci.cnyt;

public class Particle {
    private Complex[] vector;
    private int points;
    
    public Particle(int points){
        this.points=points;
        vector= new Complex[points];
    }
    
    /*
    * Calculate the norm of a state vector
    */
    public double norm(Complex[] vectors){
        double value=0;
        for(int i=0; i< points; i++){
            value= Math.pow(vectors[i].getReal(),2) + Math.pow(vectors[i].getImag(),2)+value;
        }
        return Math.sqrt(value);
    }
    
    /*
    * Calculate the probability that a particle can be found at specific position 
    */
    public double findPosition(int position) throws QuantumStateException{
        if (position <= points){
            return (Math.pow(vector[position].getReal(),2)+ Math.pow(vector[position].getImag(),2))/Math.pow(norm(vector),2);
        }
        else{
            throw new QuantumStateException("this position doesn't exist");
        }
    }
    
    /*
    * Calculate the probability of transitioning from the ﬁrst ket to the second
    */
    public Complex amplitud(Complex[] ketVector) throws QuantumStateException{
        if (ketVector.length == points){
            Complex[] answ= new Complex[points];
            Complex value=new Complex(0,0);
            for(int i=0; i<points; i++){
                ketVector[i].setImag(ketVector[i].getImag()*(-1));
            }
            
            double norm1= norm(vector), norm2= norm(ketVector);
            
            for (int i=0; i<points; i++){
                answ[i]= new Complex((ketVector[i].getReal()* vector[i].getReal())- (ketVector[i].getImag()*vector[i].getImag()),
                                (ketVector[i].getReal()*vector[i].getImag()) + (ketVector[i].getImag()*vector[i].getReal()));
            }
            
            for(int i=0; i<points; i++){
                value.setReal(value.getReal()+answ[i].getReal());
                value.setImag(value.getImag()+answ[i].getImag());
            }
            
            value.setReal(value.getReal()/(norm1*norm2));
            value.setImag(value.getImag()/(norm1*norm2));
            return value;
        }
        else{
            throw new QuantumStateException("Vectors have different dimensions");
        }
    }
    
    public void setVector(int i, Complex complex){
        vector[i]=complex;
    }
    
    public Complex[] getVector(){
        return vector;
    }
}
