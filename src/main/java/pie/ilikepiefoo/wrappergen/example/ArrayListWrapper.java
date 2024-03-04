package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
import pie.ilikepiefoo.wrappergen.util.MethodHotSwapHandler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
public class ArrayListWrapper<E> extends ArrayList<E> {
    public MethodHandler<AddAllCollectionHandler<E>> addAllCollectionHandler = new MethodHotSwapHandler<>(super::addAll);
    public MethodHandler<AddAllIntCollectionHandler<E>> addAllIntCollectionHandler = new MethodHotSwapHandler<>(super::addAll);
    public MethodHandler<AddIntObjectHandler<E>> addIntObjectHandler = new MethodHotSwapHandler<>(super::add);
    public MethodHandler<AddObjectHandler<E>> addObjectHandler = new MethodHotSwapHandler<>(super::add);
    public MethodHandler<ClearHandler> clearHandler = new MethodHotSwapHandler<>(super::clear);
    public MethodHandler<CloneHandler> cloneHandler = new MethodHotSwapHandler<>(super::clone);
    public MethodHandler<ContainsAllCollectionHandler> containsAllCollectionHandler = new MethodHotSwapHandler<>(super::containsAll);
    public MethodHandler<ContainsObjectHandler> containsObjectHandler = new MethodHotSwapHandler<>(super::contains);
    public MethodHandler<EnsureCapacityIntHandler> ensureCapacityIntHandler = new MethodHotSwapHandler<>(super::ensureCapacity);
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler = new MethodHotSwapHandler<>(super::equals);
    public MethodHandler<ForEachConsumerHandler<E>> forEachConsumerHandler = new MethodHotSwapHandler<>(super::forEach);
    public MethodHandler<GetIntHandler<E>> getIntHandler = new MethodHotSwapHandler<>(super::get);
    public MethodHandler<HashCodeHandler> hashCodeHandler = new MethodHotSwapHandler<>(super::hashCode);
    public MethodHandler<IndexOfObjectHandler> indexOfObjectHandler = new MethodHotSwapHandler<>(super::indexOf);
    public MethodHandler<IsEmptyHandler> isEmptyHandler = new MethodHotSwapHandler<>(super::isEmpty);
    public MethodHandler<IteratorHandler<E>> iteratorHandler = new MethodHotSwapHandler<>(super::iterator);
    public MethodHandler<LastIndexOfObjectHandler> lastIndexOfObjectHandler = new MethodHotSwapHandler<>(super::lastIndexOf);
    public MethodHandler<ListIteratorHandler<E>> listIteratorHandler = new MethodHotSwapHandler<>(super::listIterator);
    public MethodHandler<ListIteratorIntHandler<E>> listIteratorIntHandler = new MethodHotSwapHandler<>(super::listIterator);
    public MethodHandler<ParallelStreamHandler<E>> parallelStreamHandler = new MethodHotSwapHandler<>(super::parallelStream);
    public MethodHandler<RemoveAllCollectionHandler> removeAllCollectionHandler = new MethodHotSwapHandler<>(super::removeAll);
    public MethodHandler<RemoveIfPredicateHandler<E>> removeIfPredicateHandler = new MethodHotSwapHandler<>(super::removeIf);
    public MethodHandler<RemoveIntHandler<E>> removeIntHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<RemoveObjectHandler> removeObjectHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<ReplaceAllUnaryOperatorHandler<E>> replaceAllUnaryOperatorHandler = new MethodHotSwapHandler<>(super::replaceAll);
    public MethodHandler<RetainAllCollectionHandler> retainAllCollectionHandler = new MethodHotSwapHandler<>(super::retainAll);
    public MethodHandler<SetIntObjectHandler<E>> setIntObjectHandler = new MethodHotSwapHandler<>(super::set);
    public MethodHandler<SizeHandler> sizeHandler = new MethodHotSwapHandler<>(super::size);
    public MethodHandler<SortComparatorHandler<E>> sortComparatorHandler = new MethodHotSwapHandler<>(super::sort);
    public MethodHandler<SpliteratorHandler<E>> spliteratorHandler = new MethodHotSwapHandler<>(super::spliterator);
    public MethodHandler<StreamHandler<E>> streamHandler = new MethodHotSwapHandler<>(super::stream);
    public MethodHandler<SubListIntIntHandler<E>> subListIntIntHandler = new MethodHotSwapHandler<>(super::subList);
    public MethodHandler<ToArrayHandler> toArrayHandler = new MethodHotSwapHandler<>(super::toArray);
    public MethodHandler<ToArrayIntFunctionHandler> toArrayIntFunctionHandler = new MethodHotSwapHandler<>(super::toArray);
    public MethodHandler<ToArrayObjectHandler> toArrayObjectHandler = new MethodHotSwapHandler<>(super::toArray);
    public MethodHandler<ToStringHandler> toStringHandler = new MethodHotSwapHandler<>(super::toString);
    public MethodHandler<TrimToSizeHandler> trimToSizeHandler = new MethodHotSwapHandler<>(super::trimToSize);

    public ArrayListWrapper(Collection<? extends E> arg0) {
        super(arg0);
    }

    public ArrayListWrapper() {
        super();
    }

    public ArrayListWrapper(int arg0) {
        super(arg0);
    }

    @Override
    public boolean containsAll(Collection<?> arg0) {
        return (this.containsAllCollectionHandler != null && this.containsAllCollectionHandler.getHandler() != null) ? this.containsAllCollectionHandler.getHandler().onContainsAll(arg0) : super.containsAll(arg0);
    }

    @Override
    public String toString() {
        return (this.toStringHandler != null && this.toStringHandler.getHandler() != null) ? this.toStringHandler.getHandler().onToString() : super.toString();
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> arg0) {
        return (this.toArrayIntFunctionHandler != null && this.toArrayIntFunctionHandler.getHandler() != null) ? this.toArrayIntFunctionHandler.getHandler().onToArray(arg0) : super.toArray(arg0);
    }

    @Override
    public Stream<E> stream() {
        return (this.streamHandler != null && this.streamHandler.getHandler() != null) ? this.streamHandler.getHandler().onStream() : super.stream();
    }

    @Override
    public Stream<E> parallelStream() {
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
    public int size() {
        return (this.sizeHandler != null && this.sizeHandler.getHandler() != null) ? this.sizeHandler.getHandler().onSize() : super.size();
    }

    @Override
    public boolean isEmpty() {
        return (this.isEmptyHandler != null && this.isEmptyHandler.getHandler() != null) ? this.isEmptyHandler.getHandler().onIsEmpty() : super.isEmpty();
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
    public boolean contains(Object arg0) {
        return (this.containsObjectHandler != null && this.containsObjectHandler.getHandler() != null) ? this.containsObjectHandler.getHandler().onContains(arg0) : super.contains(arg0);
    }

    @Override
    public int indexOf(Object arg0) {
        return (this.indexOfObjectHandler != null && this.indexOfObjectHandler.getHandler() != null) ? this.indexOfObjectHandler.getHandler().onIndexOf(arg0) : super.indexOf(arg0);
    }
    @Override
    public E get(int arg0) {
        return (this.getIntHandler != null && this.getIntHandler.getHandler() != null) ? this.getIntHandler.getHandler().onGet(arg0) : super.get(arg0);
    }

    @Override
    public int lastIndexOf(Object arg0) {
        return (this.lastIndexOfObjectHandler != null && this.lastIndexOfObjectHandler.getHandler() != null) ? this.lastIndexOfObjectHandler.getHandler().onLastIndexOf(arg0) : super.lastIndexOf(arg0);
    }

    @Override
    public Object clone() {
        return (this.cloneHandler != null && this.cloneHandler.getHandler() != null) ? this.cloneHandler.getHandler().onClone() : super.clone();
    }

    @Override
    public Object[] toArray() {
        return (this.toArrayHandler != null && this.toArrayHandler.getHandler() != null) ? this.toArrayHandler.getHandler().onToArray() : super.toArray();
    }

    @Override
    public <T> T[] toArray(T[] arg0) {
        return (this.toArrayObjectHandler != null && this.toArrayObjectHandler.getHandler() != null) ? this.toArrayObjectHandler.getHandler().onToArray(arg0) : super.toArray(arg0);
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
    public boolean equals(Object arg0) {
        return (this.equalsObjectHandler != null && this.equalsObjectHandler.getHandler() != null) ? this.equalsObjectHandler.getHandler().onEquals(arg0) : super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return (this.hashCodeHandler != null && this.hashCodeHandler.getHandler() != null) ? this.hashCodeHandler.getHandler().onHashCode() : super.hashCode();
    }

    @Override
    public boolean remove(Object arg0) {
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
    public boolean addAll(Collection<? extends E> arg0) {
        return (this.addAllCollectionHandler != null && this.addAllCollectionHandler.getHandler() != null) ? this.addAllCollectionHandler.getHandler().onAddAll(arg0) : super.addAll(arg0);
    }

    @Override
    public boolean addAll(int arg0, Collection<? extends E> arg1) {
        return (this.addAllIntCollectionHandler != null && this.addAllIntCollectionHandler.getHandler() != null) ? this.addAllIntCollectionHandler.getHandler().onAddAll(arg0, arg1) : super.addAll(arg0, arg1);
    }

    @Override
    public boolean removeAll(Collection<?> arg0) {
        return (this.removeAllCollectionHandler != null && this.removeAllCollectionHandler.getHandler() != null) ? this.removeAllCollectionHandler.getHandler().onRemoveAll(arg0) : super.removeAll(arg0);
    }

    @Override
    public boolean retainAll(Collection<?> arg0) {
        return (this.retainAllCollectionHandler != null && this.retainAllCollectionHandler.getHandler() != null) ? this.retainAllCollectionHandler.getHandler().onRetainAll(arg0) : super.retainAll(arg0);
    }

    @Override
    public ListIterator<E> listIterator(int arg0) {
        return (this.listIteratorIntHandler != null && this.listIteratorIntHandler.getHandler() != null) ? this.listIteratorIntHandler.getHandler().onListIterator(arg0) : super.listIterator(arg0);
    }

    @Override
    public ListIterator<E> listIterator() {
        return (this.listIteratorHandler != null && this.listIteratorHandler.getHandler() != null) ? this.listIteratorHandler.getHandler().onListIterator() : super.listIterator();
    }

    @Override
    public Iterator<E> iterator() {
        return (this.iteratorHandler != null && this.iteratorHandler.getHandler() != null) ? this.iteratorHandler.getHandler().onIterator() : super.iterator();
    }

    @Override
    public List<E> subList(int arg0, int arg1) {
        return (this.subListIntIntHandler != null && this.subListIntIntHandler.getHandler() != null) ? this.subListIntIntHandler.getHandler().onSubList(arg0, arg1) : super.subList(arg0, arg1);
    }

    @Override
    public void forEach(Consumer<? super E> arg0) {
        if (this.forEachConsumerHandler != null && this.forEachConsumerHandler.getHandler() != null) {
            this.forEachConsumerHandler.getHandler().onForEach(arg0);
        } else {
            super.forEach(arg0);
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        return (this.spliteratorHandler != null && this.spliteratorHandler.getHandler() != null) ? this.spliteratorHandler.getHandler().onSpliterator() : super.spliterator();
    }

    @Override
    public boolean removeIf(Predicate<? super E> arg0) {
        return (this.removeIfPredicateHandler != null && this.removeIfPredicateHandler.getHandler() != null) ? this.removeIfPredicateHandler.getHandler().onRemoveIf(arg0) : super.removeIf(arg0);
    }

    @Override
    public void replaceAll(UnaryOperator<E> arg0) {
        if (this.replaceAllUnaryOperatorHandler != null && this.replaceAllUnaryOperatorHandler.getHandler() != null) {
            this.replaceAllUnaryOperatorHandler.getHandler().onReplaceAll(arg0);
        } else {
            super.replaceAll(arg0);
        }
    }

    @Override
    public void sort(Comparator<? super E> arg0) {
        if (this.sortComparatorHandler != null && this.sortComparatorHandler.getHandler() != null) {
            this.sortComparatorHandler.getHandler().onSort(arg0);
        } else {
            super.sort(arg0);
        }
    }
    @FunctionalInterface
    public interface AddAllCollectionHandler<E> {
        boolean onAddAll(Collection<? extends E> arg0);
    }

    @FunctionalInterface
    public interface AddAllIntCollectionHandler<E> {
        boolean onAddAll(int arg0, Collection<? extends E> arg1);
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
        Object onClone();
    }

    @FunctionalInterface
    public interface ContainsAllCollectionHandler {
        boolean onContainsAll(Collection<?> arg0);
    }

    @FunctionalInterface
    public interface ContainsObjectHandler {
        boolean onContains(Object arg0);
    }

    @FunctionalInterface
    public interface EnsureCapacityIntHandler {
        void onEnsureCapacity(int arg0);
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(Object arg0);
    }

    @FunctionalInterface
    public interface ForEachConsumerHandler<E> {
        void onForEach(Consumer<? super E> arg0);
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
        int onIndexOf(Object arg0);
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface IteratorHandler<E> {
        Iterator<E> onIterator();
    }

    @FunctionalInterface
    public interface LastIndexOfObjectHandler {
        int onLastIndexOf(Object arg0);
    }

    @FunctionalInterface
    public interface ListIteratorHandler<E> {
        ListIterator<E> onListIterator();
    }

    @FunctionalInterface
    public interface ListIteratorIntHandler<E> {
        ListIterator<E> onListIterator(int arg0);
    }

    @FunctionalInterface
    public interface ParallelStreamHandler<E> {
        Stream<E> onParallelStream();
    }

    @FunctionalInterface
    public interface RemoveAllCollectionHandler {
        boolean onRemoveAll(Collection<?> arg0);
    }

    @FunctionalInterface
    public interface RemoveIfPredicateHandler<E> {
        boolean onRemoveIf(Predicate<? super E> arg0);
    }

    @FunctionalInterface
    public interface RemoveIntHandler<E> {
        E onRemove(int arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectHandler {
        boolean onRemove(Object arg0);
    }

    @FunctionalInterface
    public interface ReplaceAllUnaryOperatorHandler<E> {
        void onReplaceAll(UnaryOperator<E> arg0);
    }

    @FunctionalInterface
    public interface RetainAllCollectionHandler {
        boolean onRetainAll(Collection<?> arg0);
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
        void onSort(Comparator<? super E> arg0);
    }

    @FunctionalInterface
    public interface SpliteratorHandler<E> {
        Spliterator<E> onSpliterator();
    }

    @FunctionalInterface
    public interface StreamHandler<E> {
        Stream<E> onStream();
    }

    @FunctionalInterface
    public interface SubListIntIntHandler<E> {
        List<E> onSubList(int arg0, int arg1);
    }

    @FunctionalInterface
    public interface ToArrayHandler {
        Object[] onToArray();
    }

    @FunctionalInterface
    public interface ToArrayIntFunctionHandler {
        <T> T[] onToArray(IntFunction<T[]> arg0);
    }

    @FunctionalInterface
    public interface ToArrayObjectHandler {
        <T> T[] onToArray(T[] arg0);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        String onToString();
    }

    @FunctionalInterface
    public interface TrimToSizeHandler {
        void onTrimToSize();
    }

}
