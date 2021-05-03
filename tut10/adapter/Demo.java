package tuts.tut10.to_dos.adapter;

import tuts.tut10.to_dos.adapter.adapter.SquarePegAdapter;
import tuts.tut10.to_dos.adapter.round.RoundHole;
import tuts.tut10.to_dos.adapter.round.RoundPeg;
import tuts.tut10.to_dos.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
		RoundHole hole = new RoundHole(10);
		RoundPeg peg = new RoundPeg(10);
	 
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
		if (hole.fits(peg)) {
			System.out.println("Round hole can fit with Round Peg");
		}
		
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
		SquarePeg small_peg = new SquarePeg(5);
		SquarePeg big_peg = new SquarePeg(15);
 
		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
		
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
		SquarePegAdapter small_adapter = new SquarePegAdapter(small_peg);
		SquarePegAdapter big_adapter = new SquarePegAdapter(big_peg);
		 
		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
		if (hole.fits(small_adapter)) {
			System.out.println("Hole can fit with small square peg");
		}
	 
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
		//show a suitable message
		if (!hole.fits(big_adapter)) {
			System.out.println("Hole can not fit the big square peg");
		}
	}
}