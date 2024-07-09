package HashMapsAndTires.l2;

public class TireImplementation {
    public static void main(String[] args) {
        TireNode root = new TireNode('-');
        root.insertWord(root, "coding");
        root.insertWord(root, "code");
        root.insertWord(root, "coder");
        root.insertWord(root, "codehelp");
        root.insertWord(root, "baba");
        root.insertWord(root, "babbar");
        root.insertWord(root, "apple");
        root.insertWord(root, "apmc");
        root.insertWord(root, "zebra");
        System.out.println(root.searchWord(root, "zen"));
    }

    static class TireNode {

        char data;
        TireNode[] children;
        boolean isTerminal;

        public TireNode(char data) {
            this.data = data;
            children = new TireNode[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            isTerminal = false;
        }

        public void insertWord(TireNode root, String str) {
            // base case
            if (str.isEmpty()) {
                root.isTerminal = true;
                return;
            }

            char ch = str.charAt(0);
            int index = ch - 'a';
            TireNode child;
            // presesnt
            if (root.children[index] != null) {
                child = root.children[index];
            } else {
                // not present
                child = new TireNode(ch);
                root.children[index] = child;
            }

            // recursion
            insertWord(child, str.substring(1));
        }

        public boolean searchWord(TireNode root, String word) {
            if (word.isEmpty()) {
                return root.isTerminal;
            }

            char ch = word.charAt(0);
            int index = ch - 'a';
            TireNode child;

            // present
            if (root.children[index] != null) {
                child = root.children[index];
            } else {
                return false;
            }

            // rec
            return searchWord(child, word.substring(1));
        }
    }
}
