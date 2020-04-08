import javax.swing.JOptionPane;

public class TesteAtribuicao
{
   public static void main(String[] args)
   {
      String nome = JOptionPane.showInputDialog("Informe o nome do professor: ");
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do professor: "));
      String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
      boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe com false ou true se a disciplina possue parte prática: "));
      
      Professor p1 = new Professor(nome, idade);
      Disciplina d1 = new Disciplina(nomeDisciplina, pratica);
      Atribuicao a1 = new Atribuicao(p1, d1);
      
      JOptionPane.showMessageDialog(null, a1.getDados());
      
      
   }
}