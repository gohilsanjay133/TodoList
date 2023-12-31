// Generated by Dagger (https://dagger.dev).
package com.todo.list.di.module;

import com.todo.list.data.db.dao.TodoListDAO;
import com.todo.list.repository.MainRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProviderTodoListDataSourceFactory implements Factory<MainRepository> {
  private final RoomModule module;

  private final Provider<TodoListDAO> todoListDAOProvider;

  public RoomModule_ProviderTodoListDataSourceFactory(RoomModule module,
      Provider<TodoListDAO> todoListDAOProvider) {
    this.module = module;
    this.todoListDAOProvider = todoListDAOProvider;
  }

  @Override
  public MainRepository get() {
    return providerTodoListDataSource(module, todoListDAOProvider.get());
  }

  public static RoomModule_ProviderTodoListDataSourceFactory create(RoomModule module,
      Provider<TodoListDAO> todoListDAOProvider) {
    return new RoomModule_ProviderTodoListDataSourceFactory(module, todoListDAOProvider);
  }

  public static MainRepository providerTodoListDataSource(RoomModule instance,
      TodoListDAO todoListDAO) {
    return Preconditions.checkNotNullFromProvides(instance.providerTodoListDataSource(todoListDAO));
  }
}
