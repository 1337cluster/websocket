package sudoku.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // L'utilisateur kaysift hna (via "/app/sendMessage")
    @MessageMapping("/sendMessage")
    // Controller kaysift lga3 nas li m'abonyin f "/topic/public"
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage message) {
        return message ; 
    }
}