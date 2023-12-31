// Generated by Dagger (https://dagger.dev).
package com.todo.list.view.addtask;

import com.todo.list.view.todolist.TodoListViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddTaskActivity_MembersInjector implements MembersInjector<AddTaskActivity> {
  private final Provider<TodoListViewModelFactory> addTaskViewModelFactoryProvider;

  public AddTaskActivity_MembersInjector(
      Provider<TodoListViewModelFactory> addTaskViewModelFactoryProvider) {
    this.addTaskViewModelFactoryProvider = addTaskViewModelFactoryProvider;
  }

  public static MembersInjector<AddTaskActivity> create(
      Provider<TodoListViewModelFactory> addTaskViewModelFactoryProvider) {
    return new AddTaskActivity_MembersInjector(addTaskViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AddTaskActivity instance) {
    injectAddTaskViewModelFactory(instance, addTaskViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.todo.list.view.addtask.AddTaskActivity.addTaskViewModelFactory")
  public static void injectAddTaskViewModelFactory(AddTaskActivity instance,
      TodoListViewModelFactory addTaskViewModelFactory) {
    instance.addTaskViewModelFactory = addTaskViewModelFactory;
  }
}
