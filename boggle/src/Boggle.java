import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Boggle {

    // Alphabet size
    static final int SIZE = 26;

    static final int M = 4;
    static final int N = 4;

    // trie Node
    static class TrieNode {
        TrieNode[] Child = new TrieNode[SIZE];


        boolean leaf;

        // constructor
        public TrieNode() {
            leaf = false;
            for (int i = 0; i < SIZE; i++)
                Child[i] = null;
        }
    }

  
    static void insert(TrieNode root, String Key) {
        int n = Key.length();
        TrieNode pChild = root;

        for (int i = 0; i < n; i++) {
            int index = Key.charAt(i) - 'A';

            if (pChild.Child[index] == null)
                pChild.Child[index] = new TrieNode();

            pChild = pChild.Child[index];
        }

        // make last node as leaf node
        pChild.leaf = true;
    }

    // function to check that current location
    // (i and j) is in matrix range
    static boolean isSafe(int i, int j, boolean visited[][]) {
        return (i >= 0 && i < M && j >= 0
                && j < N && !visited[i][j]);
    }

    // A recursive function to print
    // all words present on boggle
    static void searchWord(TrieNode root, char boggle[][], int i,
                           int j, boolean visited[][], String str) {
        // if we found word in trie / dictionary
        if (root.leaf == true)
            System.out.println(str);

        // If both I and j in  range and we visited
        // that element of matrix first time
        if (isSafe(i, j, visited)) {
            // make it visited
            visited[i][j] = true;

            // traverse all child of current root
            for (int K = 0; K < SIZE; K++) {
                if (root.Child[K] != null) {
                    // current character
                    char ch = (char) (K + 'A');

                    // Recursively search reaming character of word
                    // in trie for all 8 adjacent cells of
                    // boggle[i][j]
                    if (isSafe(i + 1, j + 1, visited)
                            && boggle[i + 1][j + 1] == ch)
                        searchWord(root.Child[K], boggle,
                                i + 1, j + 1,
                                visited, str + ch);
                    if (isSafe(i, j + 1, visited)
                            && boggle[i][j + 1] == ch)
                        searchWord(root.Child[K], boggle,
                                i, j + 1,
                                visited, str + ch);
                    if (isSafe(i - 1, j + 1, visited)
                            && boggle[i - 1][j + 1] == ch)
                        searchWord(root.Child[K], boggle,
                                i - 1, j + 1,
                                visited, str + ch);
                    if (isSafe(i + 1, j, visited)
                            && boggle[i + 1][j] == ch)
                        searchWord(root.Child[K], boggle,
                                i + 1, j,
                                visited, str + ch);
                    if (isSafe(i + 1, j - 1, visited)
                            && boggle[i + 1][j - 1] == ch)
                        searchWord(root.Child[K], boggle,
                                i + 1, j - 1,
                                visited, str + ch);
                    if (isSafe(i, j - 1, visited)
                            && boggle[i][j - 1] == ch)
                        searchWord(root.Child[K], boggle,
                                i, j - 1,
                                visited, str + ch);
                    if (isSafe(i - 1, j - 1, visited)
                            && boggle[i - 1][j - 1] == ch)
                        searchWord(root.Child[K], boggle,
                                i - 1, j - 1,
                                visited, str + ch);
                    if (isSafe(i - 1, j, visited)
                            && boggle[i - 1][j] == ch)
                        searchWord(root.Child[K], boggle,
                                i - 1, j,
                                visited, str + ch);
                }
            }

            // make current element unvisited
            visited[i][j] = false;
        }
    }

    // Prints all words present in dictionary.
    static void findWords(char boggle[][], TrieNode root) {
        // Mark all characters as not visited
        boolean[][] visited = new boolean[M][N];
        TrieNode pChild = root;

        String str = "";

        // traverse all matrix elements
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // we start searching for word in dictionary
                // if we found a character which is child
                // of Trie root
                if (pChild.Child[(boggle[i][j]) - 'A'] != null) {
                    str = str + boggle[i][j];
                    searchWord(pChild.Child[(boggle[i][j]) - 'A'],
                            boggle, i, j, visited, str);
                    str = "";
                }
            }
        }
    }

    // Driver program to test above function
    public static void main(String args[]) throws FileNotFoundException {

        Scanner s=new Scanner(new File("dictionary.txt"));
            ArrayList<String> dictionary=new ArrayList<>();
        while (s.hasNextLine())
            dictionary.add(s.next());

        // root Node of trie
        TrieNode root = new TrieNode();

        // insert all words of dictionary into trie
        int n = dictionary.size();
        for (int i = 0; i < n; i++)
            insert(root, dictionary.get(i));
        Scanner q=new Scanner(new File("boggle.dat"));
        char boggle[][]=new char[4][4];
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                boggle[i][j]=q.next().charAt(0);
            }
        }
        findWords(boggle, root);
    }
}