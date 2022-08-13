package thyakutake.sample.api.samplerestapi.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import thyakutake.sample.api.samplerestapi.model.TaskItem;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

@RestController
public class HomeRestController {
    private final List<TaskItem> taskItems = new ArrayList<>();

    @GetMapping(value="/restadd")
    String addItem(
            @RequestParam("task") String task,
            @RequestParam(value = "deadline") String deadline)
    {
        String id = UUID.randomUUID().toString().substring(0,8);
        TaskItem item=new TaskItem(id,task,deadline,false);
        taskItems.add(item);

        return "タスクを追加しました";
    }

    @GetMapping(value = "/restlist")
    String listItems(){
            return taskItems.stream()
                .map(TaskItem::toString)
                .collect(Collectors.joining(","));
    }


}

