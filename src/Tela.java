import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Tela extends JFrame {
    private FlowLayout layout = null;

    public Tela() {
        super("Titulo do Layout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(250, 150));
        // instânciar e configurar layout
        layout = new FlowLayout();
        setLayout(layout);
        // Definindo ao alinhamento do meu layout
        layout.setAlignment(FlowLayout.CENTER);
        // Estou adicionando butões a minha Tela
        add(new JButton("Button - 0"));
        add(new JButton("Button - 1"));
        add(new JButton("Button - 2"));
        add(new JButton("Button - 4"));
        add(new JButton("Button - 5"));
        // Agora simplesmente vou ajustar a Tela ao conteúdo
        pack();

    }

}
