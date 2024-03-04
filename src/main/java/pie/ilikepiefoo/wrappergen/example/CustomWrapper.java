package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;

import java.util.ArrayList;
public class CustomWrapper<E> extends ArrayList<E> {
    public MethodHandler<AddAllCollectionHandler<E>> addAllCollectionHandler;
    public MethodHandler<AddAllIntCollectionHandler<E>> addAllIntCollectionHandler;
    public MethodHandler<AddIntObjectHandler<E>> addIntObjectHandler;
    public MethodHandler<AddObjectHandler<E>> addObjectHandler;
    public MethodHandler<ClearHandler> clearHandler;
    public MethodHandler<CloneHandler> cloneHandler;
    public MethodHandler<ContainsAllCollectionHandler> containsAllCollectionHandler;
    public MethodHandler<ContainsObjectHandler> containsObjectHandler;
    public MethodHandler<EnsureCapacityIntHandler> ensureCapacityIntHandler;
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler;
    public MethodHandler<ForEachConsumerHandler<E>> forEachConsumerHandler;
    public MethodHandler<GetIntHandler<E>> getIntHandler;
    public MethodHandler<HashCodeHandler> hashCodeHandler;
    public MethodHandler<IndexOfObjectHandler> indexOfObjectHandler;
    public MethodHandler<IsEmptyHandler> isEmptyHandler;
    public MethodHandler<IteratorHandler<E>> iteratorHandler;
    public MethodHandler<LastIndexOfObjectHandler> lastIndexOfObjectHandler;
    public MethodHandler<ListIteratorHandler<E>> listIteratorHandler;
    public MethodHandler<ListIteratorIntHandler<E>> listIteratorIntHandler;
    public MethodHandler<ParallelStreamHandler<E>> parallelStreamHandler;
    public MethodHandler<RemoveAllCollectionHandler> removeAllCollectionHandler;
    public MethodHandler<RemoveIfPredicateHandler<E>> removeIfPredicateHandler;
    public MethodHandler<RemoveIntHandler<E>> removeIntHandler;
    public MethodHandler<RemoveObjectHandler> removeObjectHandler;
    public MethodHandler<ReplaceAllUnaryOperatorHandler<E>> replaceAllUnaryOperatorHandler;
    public MethodHandler<RetainAllCollectionHandler> retainAllCollectionHandler;
    public MethodHandler<SetIntObjectHandler<E>> setIntObjectHandler;
    public MethodHandler<SizeHandler> sizeHandler;
    public MethodHandler<SortComparatorHandler<E>> sortComparatorHandler;
    public MethodHandler<SpliteratorHandler<E>> spliteratorHandler;
    public MethodHandler<StreamHandler<E>> streamHandler;
    public MethodHandler<SubListIntIntHandler<E>> subListIntIntHandler;
    public MethodHandler<ToArrayHandler> toArrayHandler;
    public MethodHandler<ToArrayIntFunctionHandler> toArrayIntFunctionHandler;
    public MethodHandler<ToArrayObjectHandler> toArrayObjectHandler;
    public MethodHandler<ToStringHandler> toStringHandler;
    public MethodHandler<TrimToSizeHandler> trimToSizeHandler;
    public CustomWrapper(java.util.Collection<? extends E> arg0) {
        super(arg0);
    }

    public CustomWrapper() {
        super();
    }

    public CustomWrapper(int arg0) {
        super(arg0);
    }

    @Override
    public boolean containsAll(java.util.Collection<?> arg0) {
        return (this.containsAllCollectionHandler != null && this.containsAllCollectionHandler.getHandler() != null) ? this.containsAllCollectionHandler.getHandler().onContainsAll(arg0) : super.containsAll(arg0);
    }

    @Override
    public java.lang.String toString() {
        return (this.toStringHandler != null && this.toStringHandler.getHandler() != null) ? this.toStringHandler.getHandler().onToString() : super.toString();
    }

    @Override
    public <T> T[] toArray(java.util.function.IntFunction<T[]> arg0) {
        return (this.toArrayIntFunctionHandler != null && this.toArrayIntFunctionHandler.getHandler() != null) ? this.toArrayIntFunctionHandler.getHandler().onToArray(arg0) : super.toArray(arg0);
    }

    @Override
    public java.util.stream.Stream<E> stream() {
        return (this.streamHandler != null && this.streamHandler.getHandler() != null) ? this.streamHandler.getHandler().onStream() : super.stream();
    }

    @Override
    public java.util.stream.Stream<E> parallelStream() {
        return (this.parallelStreamHandler != null && this.parallelStreamHandler.getHandler() != null) ? this.parallelStreamHandler.getHandler().onParallelStream() : super.parallelStream();
    }

    @Override
    public void trimToSize() {
        if (this.trimToSizeHandler != null && this.trimToSizeHandler.getHandler() != null) {
            this.trimToSizeHandler.getHandler().onTrimToSize();
        } else {
            super.trimToSize();
        }
    }

    @Override
    public void ensureCapacity(int arg0) {
        if (this.ensureCapacityIntHandler != null && this.ensureCapacityIntHandler.getHandler() != null) {
            this.ensureCapacityIntHandler.getHandler().onEnsureCapacity(arg0);
        } else {
            super.ensureCapacity(arg0);
        }
    }

    @Override
    public int size() {
        return (this.sizeHandler != null && this.sizeHandler.getHandler() != null) ? this.sizeHandler.getHandler().onSize() : super.size();
    }

    @Override
    public boolean isEmpty() {
        return (this.isEmptyHandler != null && this.isEmptyHandler.getHandler() != null) ? this.isEmptyHandler.getHandler().onIsEmpty() : super.isEmpty();
    }

    @Override
    public boolean contains(java.lang.Object arg0) {
        return (this.containsObjectHandler != null && this.containsObjectHandler.getHandler() != null) ? this.containsObjectHandler.getHandler().onContains(arg0) : super.contains(arg0);
    }

    @Override
    public int indexOf(java.lang.Object arg0) {
        return (this.indexOfObjectHandler != null && this.indexOfObjectHandler.getHandler() != null) ? this.indexOfObjectHandler.getHandler().onIndexOf(arg0) : super.indexOf(arg0);
    }

    @Override
    public int lastIndexOf(java.lang.Object arg0) {
        return (this.lastIndexOfObjectHandler != null && this.lastIndexOfObjectHandler.getHandler() != null) ? this.lastIndexOfObjectHandler.getHandler().onLastIndexOf(arg0) : super.lastIndexOf(arg0);
    }

    @Override
    public java.lang.Object clone() {
        return (this.cloneHandler != null && this.cloneHandler.getHandler() != null) ? this.cloneHandler.getHandler().onClone() : super.clone();
    }

    @Override
    public java.lang.Object[] toArray() {
        return (this.toArrayHandler != null && this.toArrayHandler.getHandler() != null) ? this.toArrayHandler.getHandler().onToArray() : super.toArray();
    }

    @Override
    public <T> T[] toArray(T[] arg0) {
        return (this.toArrayObjectHandler != null && this.toArrayObjectHandler.getHandler() != null) ? this.toArrayObjectHandler.getHandler().onToArray(arg0) : super.toArray(arg0);
    }

    @Override
    public E get(int arg0) {
        return (this.getIntHandler != null && this.getIntHandler.getHandler() != null) ? this.getIntHandler.getHandler().onGet(arg0) : super.get(arg0);
    }

    @Override
    public E set(int arg0, E arg1) {
        return (this.setIntObjectHandler != null && this.setIntObjectHandler.getHandler() != null) ? this.setIntObjectHandler.getHandler().onSet(arg0, arg1) : super.set(arg0, arg1);
    }

    @Override
    public boolean add(E arg0) {
        return (this.addObjectHandler != null && this.addObjectHandler.getHandler() != null) ? this.addObjectHandler.getHandler().onAdd(arg0) : super.add(arg0);
    }

    @Override
    public void add(int arg0, E arg1) {
        if (this.addIntObjectHandler != null && this.addIntObjectHandler.getHandler() != null) {
            this.addIntObjectHandler.getHandler().onAdd(arg0, arg1);
        } else {
            super.add(arg0, arg1);
        }
    }

    @Override
    public E remove(int arg0) {
        return (this.removeIntHandler != null && this.removeIntHandler.getHandler() != null) ? this.removeIntHandler.getHandler().onRemove(arg0) : super.remove(arg0);
    }

    @Override
    public boolean equals(java.lang.Object arg0) {
        return (this.equalsObjectHandler != null && this.equalsObjectHandler.getHandler() != null) ? this.equalsObjectHandler.getHandler().onEquals(arg0) : super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return (this.hashCodeHandler != null && this.hashCodeHandler.getHandler() != null) ? this.hashCodeHandler.getHandler().onHashCode() : super.hashCode();
    }

    @Override
    public boolean remove(java.lang.Object arg0) {
        return (this.removeObjectHandler != null && this.removeObjectHandler.getHandler() != null) ? this.removeObjectHandler.getHandler().onRemove(arg0) : super.remove(arg0);
    }

    @Override
    public void clear() {
        if (this.clearHandler != null && this.clearHandler.getHandler() != null) {
            this.clearHandler.getHandler().onClear();
        } else {
            super.clear();
        }
    }

    @Override
    public boolean addAll(java.util.Collection<? extends E> arg0) {
        return (this.addAllCollectionHandler != null && this.addAllCollectionHandler.getHandler() != null) ? this.addAllCollectionHandler.getHandler().onAddAll(arg0) : super.addAll(arg0);
    }

    @Override
    public boolean addAll(int arg0, java.util.Collection<? extends E> arg1) {
        return (this.addAllIntCollectionHandler != null && this.addAllIntCollectionHandler.getHandler() != null) ? this.addAllIntCollectionHandler.getHandler().onAddAll(arg0, arg1) : super.addAll(arg0, arg1);
    }

    @Override
    public boolean removeAll(java.util.Collection<?> arg0) {
        return (this.removeAllCollectionHandler != null && this.removeAllCollectionHandler.getHandler() != null) ? this.removeAllCollectionHandler.getHandler().onRemoveAll(arg0) : super.removeAll(arg0);
    }

    @Override
    public boolean retainAll(java.util.Collection<?> arg0) {
        return (this.retainAllCollectionHandler != null && this.retainAllCollectionHandler.getHandler() != null) ? this.retainAllCollectionHandler.getHandler().onRetainAll(arg0) : super.retainAll(arg0);
    }

    @Override
    public java.util.ListIterator<E> listIterator(int arg0) {
        return (this.listIteratorIntHandler != null && this.listIteratorIntHandler.getHandler() != null) ? this.listIteratorIntHandler.getHandler().onListIterator(arg0) : super.listIterator(arg0);
    }

    @Override
    public java.util.ListIterator<E> listIterator() {
        return (this.listIteratorHandler != null && this.listIteratorHandler.getHandler() != null) ? this.listIteratorHandler.getHandler().onListIterator() : super.listIterator();
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return (this.iteratorHandler != null && this.iteratorHandler.getHandler() != null) ? this.iteratorHandler.getHandler().onIterator() : super.iterator();
    }

    @Override
    public java.util.List<E> subList(int arg0, int arg1) {
        return (this.subListIntIntHandler != null && this.subListIntIntHandler.getHandler() != null) ? this.subListIntIntHandler.getHandler().onSubList(arg0, arg1) : super.subList(arg0, arg1);
    }

    @Override
    public void forEach(java.util.function.Consumer<? super E> arg0) {
        if (this.forEachConsumerHandler != null && this.forEachConsumerHandler.getHandler() != null) {
            this.forEachConsumerHandler.getHandler().onForEach(arg0);
        } else {
            super.forEach(arg0);
        }
    }

    @Override
    public java.util.Spliterator<E> spliterator() {
        return (this.spliteratorHandler != null && this.spliteratorHandler.getHandler() != null) ? this.spliteratorHandler.getHandler().onSpliterator() : super.spliterator();
    }

    @Override
    public boolean removeIf(java.util.function.Predicate<? super E> arg0) {
        return (this.removeIfPredicateHandler != null && this.removeIfPredicateHandler.getHandler() != null) ? this.removeIfPredicateHandler.getHandler().onRemoveIf(arg0) : super.removeIf(arg0);
    }

    @Override
    public void replaceAll(java.util.function.UnaryOperator<E> arg0) {
        if (this.replaceAllUnaryOperatorHandler != null && this.replaceAllUnaryOperatorHandler.getHandler() != null) {
            this.replaceAllUnaryOperatorHandler.getHandler().onReplaceAll(arg0);
        } else {
            super.replaceAll(arg0);
        }
    }

    @Override
    public void sort(java.util.Comparator<? super E> arg0) {
        if (this.sortComparatorHandler != null && this.sortComparatorHandler.getHandler() != null) {
            this.sortComparatorHandler.getHandler().onSort(arg0);
        } else {
            super.sort(arg0);
        }
    }
    @FunctionalInterface
    public interface AddAllCollectionHandler<E> {
        boolean onAddAll(java.util.Collection<? extends E> arg0);
    }

    @FunctionalInterface
    public interface AddAllIntCollectionHandler<E> {
        boolean onAddAll(int arg0, java.util.Collection<? extends E> arg1);
    }

    @FunctionalInterface
    public interface AddIntObjectHandler<E> {
        void onAdd(int arg0, E arg1);
    }

    @FunctionalInterface
    public interface AddObjectHandler<E> {
        boolean onAdd(E arg0);
    }

    @FunctionalInterface
    public interface ClearHandler {
        void onClear();
    }

    @FunctionalInterface
    public interface CloneHandler {
        java.lang.Object onClone();
    }

    @FunctionalInterface
    public interface ContainsAllCollectionHandler {
        boolean onContainsAll(java.util.Collection<?> arg0);
    }

    @FunctionalInterface
    public interface ContainsObjectHandler {
        boolean onContains(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface EnsureCapacityIntHandler {
        void onEnsureCapacity(int arg0);
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface ForEachConsumerHandler<E> {
        void onForEach(java.util.function.Consumer<? super E> arg0);
    }

    @FunctionalInterface
    public interface GetIntHandler<E> {
        E onGet(int arg0);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface IndexOfObjectHandler {
        int onIndexOf(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface IteratorHandler<E> {
        java.util.Iterator<E> onIterator();
    }

    @FunctionalInterface
    public interface LastIndexOfObjectHandler {
        int onLastIndexOf(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface ListIteratorHandler<E> {
        java.util.ListIterator<E> onListIterator();
    }

    @FunctionalInterface
    public interface ListIteratorIntHandler<E> {
        java.util.ListIterator<E> onListIterator(int arg0);
    }

    @FunctionalInterface
    public interface ParallelStreamHandler<E> {
        java.util.stream.Stream<E> onParallelStream();
    }

    @FunctionalInterface
    public interface RemoveAllCollectionHandler {
        boolean onRemoveAll(java.util.Collection<?> arg0);
    }

    @FunctionalInterface
    public interface RemoveIfPredicateHandler<E> {
        boolean onRemoveIf(java.util.function.Predicate<? super E> arg0);
    }

    @FunctionalInterface
    public interface RemoveIntHandler<E> {
        E onRemove(int arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectHandler {
        boolean onRemove(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface ReplaceAllUnaryOperatorHandler<E> {
        void onReplaceAll(java.util.function.UnaryOperator<E> arg0);
    }

    @FunctionalInterface
    public interface RetainAllCollectionHandler {
        boolean onRetainAll(java.util.Collection<?> arg0);
    }

    @FunctionalInterface
    public interface SetIntObjectHandler<E> {
        E onSet(int arg0, E arg1);
    }

    @FunctionalInterface
    public interface SizeHandler {
        int onSize();
    }

    @FunctionalInterface
    public interface SortComparatorHandler<E> {
        void onSort(java.util.Comparator<? super E> arg0);
    }

    @FunctionalInterface
    public interface SpliteratorHandler<E> {
        java.util.Spliterator<E> onSpliterator();
    }

    @FunctionalInterface
    public interface StreamHandler<E> {
        java.util.stream.Stream<E> onStream();
    }

    @FunctionalInterface
    public interface SubListIntIntHandler<E> {
        java.util.List<E> onSubList(int arg0, int arg1);
    }

    @FunctionalInterface
    public interface ToArrayHandler {
        java.lang.Object[] onToArray();
    }

    @FunctionalInterface
    public interface ToArrayIntFunctionHandler {
        <T> T[] onToArray(java.util.function.IntFunction<T[]> arg0);
    }

    @FunctionalInterface
    public interface ToArrayObjectHandler {
        <T> T[] onToArray(T[] arg0);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        java.lang.String onToString();
    }

    @FunctionalInterface
    public interface TrimToSizeHandler {
        void onTrimToSize();
    }

}
