import java.util.*;

public class CandidatePool {
	// instance variable: ArrayList of Candidate objects called pool
	private ArrayList<Candidate> pool;

	// constructor: initialize pool
	public CandidatePool() {
		this.pool = new ArrayList<Candidate>();
	}

	// addCandidate: adds a Candidate to the end of the pool ArrayList
	public void addCandidate(Candidate candidate) {
		this.pool.add(candidate);
	}

	// write the getCandidatesForPosition method here
	public ArrayList<Candidate> getCandidatesForPosition(String position) {
		ArrayList<Candidate> candidatesForPosition = new ArrayList<Candidate>();
		for (int i = 0; i < this.pool.size(); i++) {
			if (pool.get(i).getPosition().equals(position)) {
				candidatesForPosition.add(this.pool.get(i));
			}
		}
		return candidatesForPosition;
	}

	// write the getBestCandidate method here
	public Candidate getBestCandidate(String position) {
		// use candidates applying for this position to narrow down the list from the
		// start
		ArrayList<Candidate> candidatesForPosition = this.getCandidatesForPosition(position);
		// find candidate with best score by checking each candidates score and storing
		// each one that is higher
		Candidate bestCandidate = candidatesForPosition.get(0);
		for (int i = 1; i < candidatesForPosition.size(); i++) {
			if (candidatesForPosition.get(i).getScore() > bestCandidate.getScore()) {
				bestCandidate = candidatesForPosition.get(i);
			}
		}
		return bestCandidate;
	}

	// write the removeCandidatesForPosition method here
	public void removeCandidatesForPosition(String position) {
		// loop backwards to prevent skip issues
		// remove candidates if their position matches the given position
		for (int i = 0; i < this.pool.size(); i++) {
			if (this.pool.get(i).getPosition().equals(position)) {
				this.pool.remove(i);
				i--;
			}
		}
	}

	// write the getPool method here
	public ArrayList<Candidate> getPool() {
		return this.pool;
	}

	public static void main(String[] args) {
		CandidatePool cp = new CandidatePool();

		Candidate c1 = new Candidate(1, "assistant", 90);
		Candidate c2 = new Candidate(2, "manager", 95);
		Candidate c3 = new Candidate(3, "manager", 82);
		Candidate c4 = new Candidate(4, "executive", 99);
		Candidate c5 = new Candidate(5, "manager", 87);
		Candidate c6 = new Candidate(6, "executive", 91);
		Candidate c7 = new Candidate(7, "assistant", 80);
		Candidate c8 = new Candidate(8, "assistant", 72);

		cp.addCandidate(c1);
		cp.addCandidate(c2);
		cp.addCandidate(c3);
		cp.addCandidate(c4);
		cp.addCandidate(c5);
		cp.addCandidate(c6);
		cp.addCandidate(c7);
		cp.addCandidate(c8);

		// write code to test all of your methods here
		System.out.println(cp.getPool());
		System.out.println("/////////////");
		System.out.println(cp.getCandidatesForPosition("manager"));
		System.out.println("/////////////");
		System.out.println(cp.getBestCandidate("manager"));
		System.out.println("/////////////");
		cp.removeCandidatesForPosition("assistant");
		System.out.println(cp.getPool());
	}
}
