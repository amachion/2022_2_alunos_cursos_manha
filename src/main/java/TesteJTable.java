
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TesteJTable {
    public static void main (String args[]) {
        //vamos definir uma tabela para teste
        //linha de título
        String[] titulos = {"nome", "idade", "sexo", "endereco"};
        Object[][] dados = {
            {"Ana", 21, 'F', "Rua X, 25"},
            {"Gil", 22, 'M', "Rua 13, 123"},
            {"Joao", 20, 'M', "Rua 25, 567"}
        };
        JTable table = new JTable (dados, titulos);
        
        //caso seja necessária a rolagem 
        JScrollPane scrollPane = new JScrollPane(table);
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
