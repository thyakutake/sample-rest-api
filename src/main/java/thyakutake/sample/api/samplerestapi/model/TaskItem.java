package thyakutake.sample.api.samplerestapi.model;

public record TaskItem(
        String id,
        String task,
        String deadline,
        boolean done
) {

}