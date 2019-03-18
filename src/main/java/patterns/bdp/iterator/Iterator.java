package patterns.bdp.iterator;

import java.util.HashSet;
import java.util.Set;

class RedHead implements Iterable<RedHead> {
    private Set<RedHead> redHeads = new HashSet<RedHead>();
    
    public void add(final RedHead redHead) {
        redHeads.add(redHead);
    }
    @Override
    public java.util.Iterator<RedHead> iterator() {
        return redHeads.iterator();
    }
}


class Weasley extends RedHead {
    private String name;
    
    public Weasley(final String name) {
        this.name = name;
    }
    public String toString() {
        return this.name + " Weasley";
    }
}

public class Iterator {
	
	 public static void main(String[] args) {
	        RedHead redHead = new RedHead();
	        
	        redHead.add(new Weasley("Arthur"));
	        redHead.add(new Weasley("Molly"));
	        redHead.add(new Weasley("Bill"));
	        redHead.add(new Weasley("Charlie"));
	        redHead.add(new Weasley("Percy"));
	        redHead.add(new Weasley("Fred"));
	        redHead.add(new Weasley("George"));
	        redHead.add(new Weasley("Ron"));
	        redHead.add(new Weasley("Ginny"));
	        
	        for (RedHead rh : redHead) {
	            System.out.println(rh);
	        }
	    }

}
