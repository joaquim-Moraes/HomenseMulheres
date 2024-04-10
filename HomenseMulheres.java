/*Escreva um programa que leia um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.  */
import javax.swing.JOptionPane;
public class HomenseMulheres {
public static void main(String[] args) {
    double alturanumero,calculo,i,mulheres,homens,alturan;
    double maiorAltura = Double.MIN_VALUE;
    double menorAltura = Double.MAX_VALUE;
    i = 1;
    mulheres = 0;
    homens = 0;
    alturan = 0;
    while(i<=10){
        String genero = JOptionPane.showInputDialog("Digite seu genero:");
        String altura = JOptionPane.showInputDialog("Digite a sua altura em metros: ");
        alturanumero = Double.parseDouble(altura);
        i = i+1;

        if (alturanumero > maiorAltura) {
            maiorAltura = alturanumero;
        }
        if (alturanumero < menorAltura) {
            menorAltura = alturanumero;
        }


        if (genero.equals("masculino")) {
        homens = homens + 1;
        alturan = alturanumero + alturan;
        }
        else{
            mulheres = mulheres + 1;
        }
    }
        calculo = alturan/homens;
        JOptionPane.showMessageDialog(null,"A media de altura sera: " + calculo);
        JOptionPane.showMessageDialog(null,"O total de mulheres é:  " + mulheres);
        JOptionPane.showMessageDialog(null, "A maior altura do grupo é: " + maiorAltura);
        JOptionPane.showMessageDialog(null, "A menor altura do grupo é: " + menorAltura);


}
}
