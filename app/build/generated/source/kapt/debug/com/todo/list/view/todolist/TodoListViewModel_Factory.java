// Generated by Dagger (https://dagger.dev).
package com.todo.list.view.todolist;

import com.todo.list.usecasae.TodoListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TodoListViewModel_Factory implements Factory<TodoListViewModel> {
  private final Provider<TodoListUseCase> todoListUseCaseProvider;

  public TodoListViewModel_Factory(Provider<TodoListUseCase> todoListUseCaseProvider) {
    this.todoListUseCaseProvider = todoListUseCaseProvider;
  }

  @Override
  public TodoListViewModel get() {
    return newInstance(todoListUseCaseProvider.get());
  }

  public static TodoListViewModel_Factory create(
      Provider<TodoListUseCase> todoListUseCaseProvider) {
    return new TodoListViewModel_Factory(todoListUseCaseProvider);
  }

  public static TodoListViewModel newInstance(TodoListUseCase todoListUseCase) {
    return new TodoListViewModel(todoListUseCase);
  }
}
