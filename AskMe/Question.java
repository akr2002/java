import java.util.Random;

// An enumeration fo the possible answers
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();
    Answers ask() {
	int prob = (int) (100 * rand.nestDouble());

	if (prob < 15) {
	    return Answers.MAYBE; // 15%
	}
	else if (prob < 30) {
	    return Answers.NO; // 15%
	}
	else if (prob < 60) {
	    return Answers.YES; // 30%
	}
	else if (prob < 75) {
	    return Answers.LATER; // 15%
	}
	else if (prob < 98) {
	    return Answers.SOON; // 13%
	}
	else return Answers.NEVER;
    }
}
