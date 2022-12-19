package interfaces;

public interface IStudent {
    int completedAssignments(boolean finishedHw);

    interface ILibraryCard {
        boolean cancelCard(boolean active);
    }
}
