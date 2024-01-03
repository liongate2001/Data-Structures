import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Trees extends JFrame {

    JTree tree;

    public Trees() {

        this.setTitle("HTMLTREE");
        this.setSize(400, 400);
        this.setVisible(true);

        DefaultMutableTreeNode html = new DefaultMutableTreeNode("html");
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");

        html.add(head);
        html.add(body);

        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
        head.add(meta);
        head.add(title);

        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
        DefaultMutableTreeNode hi = new DefaultMutableTreeNode("hi");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");

        DefaultMutableTreeNode li = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode lii = new DefaultMutableTreeNode("lii");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");

        body.add(ul);
        body.add(hi);

        body.add(h2);
        h2.add(a);

        ul.add(li);
        ul.add(lii);

        tree = new JTree(html);

        add(tree);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Trees();

        System.out.println("Root Node: html\n");

        System.out.println("Parent Nodes: html. body, ul, h2\n");

        System.out.println("Siblings: (head, body) (meta, title) (ul, h1, h2) (li, li)\n");

        System.out.println(
                "One Level Subtrees: (html - head/body) (head - meta/title) (body - ul/h1/h2) (ul - li/li) (h2 - a)\n");

        System.out.println("Nodes per level: (level 0 - html)");
        System.out.println("                 (Level 1 - head and body)");
        System.out.println("                 (Level 2 - meta, title, ul,h1,h2)");
        System.out.println("                 (Level 3 - li, li, a)\n   ");

        System.out.println("Depth: 3\n");
        System.out.println("Degree of each one level subtree: (subtree html = 2)");
        System.out.println("                                  (subtree head = 2)");
        System.out.println("                                  (subtree body = 3)");
        System.out.println("                                  (subtree ul   = 2)");
        System.out.println("                                  (subtree h2   = 1)\n");

        System.out.println("List of Nodes Based on breadth first, preorder and postorder: \n");

        System.out.println("Breadth-first  - Html, head, body, meta, title, ul,h1,h2,li,li,a");
        System.out.println("Preorder       - Html,head,meta,title,body,ul,li,li,h1,h2,a");
        System.out.println("PostOrder      - Meta,title,head,li,li,ul,h1,body,a,h2,html ");

    }

}
