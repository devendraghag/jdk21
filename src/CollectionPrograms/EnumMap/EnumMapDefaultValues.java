package CollectionPrograms.EnumMap;

import java.util.*;

enum Status { NEW, IN_PROGRESS, COMPLETED }

public class EnumMapDefaultValues {
    public static void main(String[] args) {
        EnumMap<Status, String> taskStatus = new EnumMap<>(Status.class);
        taskStatus.put(Status.NEW, "Task is newly created");
        taskStatus.put(Status.IN_PROGRESS, "Task is being worked on");

        // Default value for 'COMPLETED' status
        String completedStatus = taskStatus.getOrDefault(Status.COMPLETED, "Task is not completed yet");
        System.out.println("Status of COMPLETED: " + completedStatus);
    }
}
