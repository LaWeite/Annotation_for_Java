# RxJava - работа с потоками и достижение асинхронности, также выделяют в противовес еще Корутины

> [!NOTE]
> Существуют две сущности: производители и потребители (Observables и Observers). 
> Общая идея состоит в реализации трёх задач - создать поток данных, привести данные в нужный вид, получить исправленные данные.

Поток (Observable) - это источник событий. Он может быть создан из различных источников, таких как сетевой запрос, ввод пользователя или датчик.\
Обработчик (Observer) - это объект, который получает события от потока.\
Операция (Operator) - это функция, которая может быть применена к потоку для изменения его поведения
