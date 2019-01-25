package functionalinterface;

@FunctionalInterface
public interface DeletePredicate {
	boolean test(Dept dept);
}
