package web.ordersspringboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.web.servlet.MockMvc;
import web.ordersspringboot.controller.TaskController;
import web.ordersspringboot.model.Task;
import web.ordersspringboot.model.TaskStatus;
import web.ordersspringboot.service.TaskService;

import java.util.List;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TaskController.class)
public class TaskControllerTest {
    @Autowired
  private MockMvc mockMvc;
@MockBean
    TaskService taskService;

@Test
    public void getAllTest() throws Exception {
    Task task = new Task();
    task.setId(1L);
    task.setStatus(TaskStatus.DONE);
    task.setTitle("Task1");
    when(taskService.findAll()).thenReturn(List.of(task));
    mockMvc.perform(get("/api/tasks")).andExpect(status().isOk())
            .andExpect(jsonPath("$[0].title").value("Task1"))
            .andExpect(jsonPath("$[0].status").value("DONE"));

}
    @Test
    public void getByIdTest() throws Exception {
        Task task = new Task();
        task.setId(1L);
        task.setStatus(TaskStatus.DONE);
        task.setTitle("Task1");
        when(taskService.findById(1L)).thenReturn(task);
        mockMvc.perform(get("/api/tasks/1")).andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Task1"))
                .andExpect(jsonPath("$.status").value("DONE"));

    }

}

//Требования:

//проверить:
//HTTP-статусы (200, 201, 204)
//JSON-поля (title, status)
//корректность ResponseEntity