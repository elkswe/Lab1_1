package clickcopy;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Класс-контроллер для рабочего окна:
 * обработка нажатия клавиш.
 *
 * @author Егор Ананько
 *
 */
public class Controller {

    private TextField firstField,
            secField,
            thField;

    private Button text1to2,
            text2to3;

    /**
     * Инициализация полей и регистрация обработчиков клавиш.
     * @param firF Первое текстовое поле
     * @param secF Второе текстовое поле
     * @param thF Третье текстовое поле
     * @param but1to2 Клавиша "Копировать из 1 в 2"
     * @param but2to3 Клавиша "Копировать из 2 в 3"
     */
    public void initController(TextField firF,
                               TextField secF,
                               TextField thF,
                               Button but1to2,
                               Button but2to3) {
        firstField = firF;
        secField = secF;
        thField = thF;
        text1to2 = but1to2;
        text2to3 = but2to3;

        text1to2.setOnAction(handleBut1to2());
        text2to3.setOnAction(handleBut2to3());
    }

    /**
     * Обработчик нажатия клавиши "Копировать из 1 в 2".
     */
    private javafx.event.EventHandler<ActionEvent> handleBut1to2() {
        return event -> {
            secField.setText(firstField.getText());
        };
    }

    /**
     * Обработчик нажатия клавиши "Копировать из 2 в 3".
     */
    private EventHandler<ActionEvent> handleBut2to3() {
        return event -> {
            thField.setText(secField.getText());
        };
    }
}
