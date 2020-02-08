package ua.training.droidwars.controller;

import ua.training.droidwars.model.Droid;

import java.util.List;

public interface Rules {

    List<Droid> introduceDroids(); // Возвращает всех дроидов в списке. Выводит информацию о каждом из них, рассказывает правила.
    List<Droid> chooseDroids(List<Droid> droids); // Пользователь выбирает 8 дроидов для поединка.
    Droid startTournament(List<Droid> droids); // Создает сетку из списка, и начинает проводить поединки между дроидами. Возвращает победителя турнира.
    Droid droidsFight(Droid firstDroid, Droid secondDroid); // Проводит поединок между двумя дроидами. Нужен в пред. методе.
    void announceResult(Droid winner, List<Droid> droids); // Анонс победителя, его статистика по победам. Список проигравших по раундам.

}
