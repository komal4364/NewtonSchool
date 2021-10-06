
class URLNode {
    String url;
    URLNode next;
    URLNode prev;

    URLNode(String url) {
        this.url = url;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    public static void main(String[] args) {
        BrowserHistory h = new BrowserHistory("leetcode.com");
        h.visit("google.com");
        h.visit("facebook.com");
        h.visit("youtube.com");
        System.out.println(h.back(1));
        System.out.println(h.back(1));
        System.out.println(h.forward(1));
        h.visit("linkedln.com");
        System.out.println(h.forward(2));
        System.out.println(h.back(2));
        System.out.println(h.back(7));
    }
    URLNode curr;
    public BrowserHistory(String homepage) {
        curr = new URLNode(homepage);
    }
    
    public void visit(String url) {
        curr.next = new URLNode(url);
        curr.next.prev = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while (steps > 0 && curr.prev != null) {
            steps--;
            curr = curr.prev;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while (steps > 0 && curr.next != null) {
            steps--;
            curr = curr.next;
        }
        return curr.url;
    }
}