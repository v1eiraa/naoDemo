package com.example.naodemo;



public class Aluno {

    private int matricula;
    private int média;


    public int getMatricula() {return matricula;}

    public void setMatricula(int matricula) {this.matricula = matricula;}

    public int getMédia() {return média;}

    public void setMédia(int média) {this.média = média;}

   // int main(void)
   //  {
    //      int nota1 = 0, nota2, media;
//
    //      media = (nota1 + nota2) / 2;
//
    //     //Saída
    //     System.out.println("Media do aluno =\n",media);
//
    //   }



    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", média=" + média +
                '}';
    }
}
