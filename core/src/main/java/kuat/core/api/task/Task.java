package kuat.core.api.task;

import kuat.core.api.task.impl.TaskImpl;

public sealed interface Task<C> permits TaskImpl {
}
