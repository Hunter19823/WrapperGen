package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;

public class CustomWrapper<E> extends java.util.ArrayList<E> {
    public final MethodOverrideHandler<AddAllCollectionHandler<E>> addAllCollectionHandler;
    public final MethodOverrideHandler<AddAllintCollectionHandler<E>> addAllintCollectionHandler;
    public final MethodOverrideHandler<AddObjectHandler<E>> addObjectHandler;
    public final MethodOverrideHandler<AddintObjectHandler<E>> addintObjectHandler;
    public final MethodOverrideHandler<ClearHandler> clearHandler;
    public final MethodOverrideHandler<CloneHandler> cloneHandler;
    public final MethodOverrideHandler<ContainsAllCollectionHandler> containsAllCollectionHandler;
    public final MethodOverrideHandler<ContainsObjectHandler> containsObjectHandler;
    public final MethodOverrideHandler<EnsureCapacityintHandler> ensureCapacityintHandler;
    public final MethodOverrideHandler<EqualsObjectHandler> equalsObjectHandler;
    public final MethodOverrideHandler<ForEachConsumerHandler<E>> forEachConsumerHandler;
    public final MethodOverrideHandler<GetintHandler<E>> getintHandler;
    public final MethodOverrideHandler<HashCodeHandler> hashCodeHandler;
    public final MethodOverrideHandler<IndexOfObjectHandler> indexOfObjectHandler;
    public final MethodOverrideHandler<IsEmptyHandler> isEmptyHandler;
    public final MethodOverrideHandler<IteratorHandler<E>> iteratorHandler;
    public final MethodOverrideHandler<LastIndexOfObjectHandler> lastIndexOfObjectHandler;
    public final MethodOverrideHandler<ListIteratorHandler<E>> listIteratorHandler;
    public final MethodOverrideHandler<ListIteratorintHandler<E>> listIteratorintHandler;
    public final MethodOverrideHandler<ParallelStreamHandler<E>> parallelStreamHandler;
    public final MethodOverrideHandler<RemoveAllCollectionHandler> removeAllCollectionHandler;
    public final MethodOverrideHandler<RemoveIfPredicateHandler<E>> removeIfPredicateHandler;
    public final MethodOverrideHandler<RemoveObjectHandler> removeObjectHandler;
    public final MethodOverrideHandler<RemoveintHandler<E>> removeintHandler;
    public final MethodOverrideHandler<ReplaceAllUnaryOperatorHandler<E>> replaceAllUnaryOperatorHandler;
    public final MethodOverrideHandler<RetainAllCollectionHandler> retainAllCollectionHandler;
    public final MethodOverrideHandler<SetintObjectHandler<E>> setintObjectHandler;
    public final MethodOverrideHandler<SizeHandler> sizeHandler;
    public final MethodOverrideHandler<SortComparatorHandler<E>> sortComparatorHandler;
    public final MethodOverrideHandler<SpliteratorHandler<E>> spliteratorHandler;
    public final MethodOverrideHandler<StreamHandler<E>> streamHandler;
    public final MethodOverrideHandler<SubListintintHandler<E>> subListintintHandler;
    public final MethodOverrideHandler<ToArrayHandler> toArrayHandler;
    public final MethodOverrideHandler<ToArrayIntFunctionHandler> toArrayIntFunctionHandler;
    public final MethodOverrideHandler<ToArrayObjectHandler> toArrayObjectHandler;
    public final MethodOverrideHandler<ToStringHandler> toStringHandler;
    public final MethodOverrideHandler<TrimToSizeHandler> trimToSizeHandler;

    public CustomWrapper(java.util.Collection<? extends E> arg0) {
        super(arg0);
        this.addObjectHandler = new MethodOverrideHandler<>(super::add);
        this.addintObjectHandler = new MethodOverrideHandler<>(super::add);
        this.removeObjectHandler = new MethodOverrideHandler<>(super::remove);
        this.removeintHandler = new MethodOverrideHandler<>(super::remove);
        this.getintHandler = new MethodOverrideHandler<>(super::get);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
        this.cloneHandler = new MethodOverrideHandler<>(super::clone);
        this.indexOfObjectHandler = new MethodOverrideHandler<>(super::indexOf);
        this.clearHandler = new MethodOverrideHandler<>(super::clear);
        this.lastIndexOfObjectHandler = new MethodOverrideHandler<>(super::lastIndexOf);
        this.isEmptyHandler = new MethodOverrideHandler<>(super::isEmpty);
        this.replaceAllUnaryOperatorHandler = new MethodOverrideHandler<>(super::replaceAll);
        this.sizeHandler = new MethodOverrideHandler<>(super::size);
        this.subListintintHandler = new MethodOverrideHandler<>(super::subList);
        this.toArrayObjectHandler = new MethodOverrideHandler<>(super::toArray);
        this.toArrayHandler = new MethodOverrideHandler<>(super::toArray);
        this.iteratorHandler = new MethodOverrideHandler<>(super::iterator);
        this.containsObjectHandler = new MethodOverrideHandler<>(super::contains);
        this.spliteratorHandler = new MethodOverrideHandler<>(super::spliterator);
        this.addAllCollectionHandler = new MethodOverrideHandler<>(super::addAll);
        this.addAllintCollectionHandler = new MethodOverrideHandler<>(super::addAll);
        this.setintObjectHandler = new MethodOverrideHandler<>(super::set);
        this.forEachConsumerHandler = new MethodOverrideHandler<>(super::forEach);
        this.ensureCapacityintHandler = new MethodOverrideHandler<>(super::ensureCapacity);
        this.trimToSizeHandler = new MethodOverrideHandler<>(super::trimToSize);
        this.removeIfPredicateHandler = new MethodOverrideHandler<>(super::removeIf);
        this.sortComparatorHandler = new MethodOverrideHandler<>(super::sort);
        this.removeAllCollectionHandler = new MethodOverrideHandler<>(super::removeAll);
        this.retainAllCollectionHandler = new MethodOverrideHandler<>(super::retainAll);
        this.listIteratorHandler = new MethodOverrideHandler<>(super::listIterator);
        this.listIteratorintHandler = new MethodOverrideHandler<>(super::listIterator);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.containsAllCollectionHandler = new MethodOverrideHandler<>(super::containsAll);
        this.toArrayIntFunctionHandler = new MethodOverrideHandler<>(this::toArray);
        this.streamHandler = new MethodOverrideHandler<>(this::stream);
        this.parallelStreamHandler = new MethodOverrideHandler<>(this::parallelStream);
    }

    @Override
    public <T> T[] toArray(java.util.function.IntFunction<T[]> arg0) {
        return this.toArrayIntFunctionHandler.getHandler().onToArray(arg0);
    }

    @Override
    public java.util.stream.Stream<E> stream() {
        return this.streamHandler.getHandler().onStream();
    }

    @Override
    public java.util.stream.Stream<E> parallelStream() {
        return this.parallelStreamHandler.getHandler().onParallelStream();
    }

    public CustomWrapper() {
        super();
        this.addObjectHandler = new MethodOverrideHandler<>(super::add);
        this.addintObjectHandler = new MethodOverrideHandler<>(super::add);
        this.removeObjectHandler = new MethodOverrideHandler<>(super::remove);
        this.removeintHandler = new MethodOverrideHandler<>(super::remove);
        this.getintHandler = new MethodOverrideHandler<>(super::get);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
        this.cloneHandler = new MethodOverrideHandler<>(super::clone);
        this.indexOfObjectHandler = new MethodOverrideHandler<>(super::indexOf);
        this.clearHandler = new MethodOverrideHandler<>(super::clear);
        this.lastIndexOfObjectHandler = new MethodOverrideHandler<>(super::lastIndexOf);
        this.isEmptyHandler = new MethodOverrideHandler<>(super::isEmpty);
        this.replaceAllUnaryOperatorHandler = new MethodOverrideHandler<>(super::replaceAll);
        this.sizeHandler = new MethodOverrideHandler<>(super::size);
        this.subListintintHandler = new MethodOverrideHandler<>(super::subList);
        this.toArrayObjectHandler = new MethodOverrideHandler<>(super::toArray);
        this.toArrayHandler = new MethodOverrideHandler<>(super::toArray);
        this.iteratorHandler = new MethodOverrideHandler<>(super::iterator);
        this.containsObjectHandler = new MethodOverrideHandler<>(super::contains);
        this.spliteratorHandler = new MethodOverrideHandler<>(super::spliterator);
        this.addAllCollectionHandler = new MethodOverrideHandler<>(super::addAll);
        this.addAllintCollectionHandler = new MethodOverrideHandler<>(super::addAll);
        this.setintObjectHandler = new MethodOverrideHandler<>(super::set);
        this.forEachConsumerHandler = new MethodOverrideHandler<>(super::forEach);
        this.ensureCapacityintHandler = new MethodOverrideHandler<>(super::ensureCapacity);
        this.trimToSizeHandler = new MethodOverrideHandler<>(super::trimToSize);
        this.removeIfPredicateHandler = new MethodOverrideHandler<>(super::removeIf);
        this.sortComparatorHandler = new MethodOverrideHandler<>(super::sort);
        this.removeAllCollectionHandler = new MethodOverrideHandler<>(super::removeAll);
        this.retainAllCollectionHandler = new MethodOverrideHandler<>(super::retainAll);
        this.listIteratorHandler = new MethodOverrideHandler<>(super::listIterator);
        this.listIteratorintHandler = new MethodOverrideHandler<>(super::listIterator);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.containsAllCollectionHandler = new MethodOverrideHandler<>(super::containsAll);
        this.toArrayIntFunctionHandler = new MethodOverrideHandler<>(this::toArray);
        this.streamHandler = new MethodOverrideHandler<>(this::stream);
        this.parallelStreamHandler = new MethodOverrideHandler<>(this::parallelStream);
    }

    public CustomWrapper(int arg0) {
        super(arg0);
        this.addObjectHandler = new MethodOverrideHandler<>(super::add);
        this.addintObjectHandler = new MethodOverrideHandler<>(super::add);
        this.removeObjectHandler = new MethodOverrideHandler<>(super::remove);
        this.removeintHandler = new MethodOverrideHandler<>(super::remove);
        this.getintHandler = new MethodOverrideHandler<>(super::get);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
        this.cloneHandler = new MethodOverrideHandler<>(super::clone);
        this.indexOfObjectHandler = new MethodOverrideHandler<>(super::indexOf);
        this.clearHandler = new MethodOverrideHandler<>(super::clear);
        this.lastIndexOfObjectHandler = new MethodOverrideHandler<>(super::lastIndexOf);
        this.isEmptyHandler = new MethodOverrideHandler<>(super::isEmpty);
        this.replaceAllUnaryOperatorHandler = new MethodOverrideHandler<>(super::replaceAll);
        this.sizeHandler = new MethodOverrideHandler<>(super::size);
        this.subListintintHandler = new MethodOverrideHandler<>(super::subList);
        this.toArrayObjectHandler = new MethodOverrideHandler<>(super::toArray);
        this.toArrayHandler = new MethodOverrideHandler<>(super::toArray);
        this.iteratorHandler = new MethodOverrideHandler<>(super::iterator);
        this.containsObjectHandler = new MethodOverrideHandler<>(super::contains);
        this.spliteratorHandler = new MethodOverrideHandler<>(super::spliterator);
        this.addAllCollectionHandler = new MethodOverrideHandler<>(super::addAll);
        this.addAllintCollectionHandler = new MethodOverrideHandler<>(super::addAll);
        this.setintObjectHandler = new MethodOverrideHandler<>(super::set);
        this.forEachConsumerHandler = new MethodOverrideHandler<>(super::forEach);
        this.ensureCapacityintHandler = new MethodOverrideHandler<>(super::ensureCapacity);
        this.trimToSizeHandler = new MethodOverrideHandler<>(super::trimToSize);
        this.removeIfPredicateHandler = new MethodOverrideHandler<>(super::removeIf);
        this.sortComparatorHandler = new MethodOverrideHandler<>(super::sort);
        this.removeAllCollectionHandler = new MethodOverrideHandler<>(super::removeAll);
        this.retainAllCollectionHandler = new MethodOverrideHandler<>(super::retainAll);
        this.listIteratorHandler = new MethodOverrideHandler<>(super::listIterator);
        this.listIteratorintHandler = new MethodOverrideHandler<>(super::listIterator);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.containsAllCollectionHandler = new MethodOverrideHandler<>(super::containsAll);
        this.toArrayIntFunctionHandler = new MethodOverrideHandler<>(this::toArray);
        this.streamHandler = new MethodOverrideHandler<>(this::stream);
        this.parallelStreamHandler = new MethodOverrideHandler<>(this::parallelStream);
    }

    @Override
    public void trimToSize() {
        this.trimToSizeHandler.getHandler().onTrimToSize();
    }

    @Override
    public void ensureCapacity(int arg0) {
        this.ensureCapacityintHandler.getHandler().onEnsureCapacity(arg0);
    }

    @Override
    public int size() {
        return this.sizeHandler.getHandler().onSize();
    }

    @Override
    public boolean isEmpty() {
        return this.isEmptyHandler.getHandler().onIsEmpty();
    }

    @Override
    public boolean contains(java.lang.Object arg0) {
        return this.containsObjectHandler.getHandler().onContains(arg0);
    }

    @Override
    public int indexOf(java.lang.Object arg0) {
        return this.indexOfObjectHandler.getHandler().onIndexOf(arg0);
    }

    @Override
    public int lastIndexOf(java.lang.Object arg0) {
        return this.lastIndexOfObjectHandler.getHandler().onLastIndexOf(arg0);
    }

    @Override
    public java.lang.Object clone() {
        return this.cloneHandler.getHandler().onClone();
    }

    @Override
    public java.lang.Object[] toArray() {
        return this.toArrayHandler.getHandler().onToArray();
    }

    @Override
    public <T> T[] toArray(T[] arg0) {
        return this.toArrayObjectHandler.getHandler().onToArray(arg0);
    }

    @Override
    public E get(int arg0) {
        return this.getintHandler.getHandler().onGet(arg0);
    }

    @Override
    public E set(int arg0, E arg1) {
        return this.setintObjectHandler.getHandler().onSet(arg0, arg1);
    }

    @Override
    public boolean add(E arg0) {
        return this.addObjectHandler.getHandler().onAdd(arg0);
    }

    @Override
    public void add(int arg0, E arg1) {
        this.addintObjectHandler.getHandler().onAdd(arg0, arg1);
    }

    @Override
    public E remove(int arg0) {
        return this.removeintHandler.getHandler().onRemove(arg0);
    }

    @Override
    public boolean equals(java.lang.Object arg0) {
        return this.equalsObjectHandler.getHandler().onEquals(arg0);
    }

    @Override
    public int hashCode() {
        return this.hashCodeHandler.getHandler().onHashCode();
    }

    @Override
    public boolean remove(java.lang.Object arg0) {
        return this.removeObjectHandler.getHandler().onRemove(arg0);
    }

    @Override
    public void clear() {
        this.clearHandler.getHandler().onClear();
    }

    @Override
    public boolean addAll(java.util.Collection<? extends E> arg0) {
        return this.addAllCollectionHandler.getHandler().onAddAll(arg0);
    }

    @Override
    public boolean addAll(int arg0, java.util.Collection<? extends E> arg1) {
        return this.addAllintCollectionHandler.getHandler().onAddAll(arg0, arg1);
    }

    @Override
    public boolean removeAll(java.util.Collection<?> arg0) {
        return this.removeAllCollectionHandler.getHandler().onRemoveAll(arg0);
    }

    @Override
    public boolean retainAll(java.util.Collection<?> arg0) {
        return this.retainAllCollectionHandler.getHandler().onRetainAll(arg0);
    }

    @Override
    public java.util.ListIterator<E> listIterator(int arg0) {
        return this.listIteratorintHandler.getHandler().onListIterator(arg0);
    }

    @Override
    public java.util.ListIterator<E> listIterator() {
        return this.listIteratorHandler.getHandler().onListIterator();
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return this.iteratorHandler.getHandler().onIterator();
    }

    @Override
    public java.util.List<E> subList(int arg0, int arg1) {
        return this.subListintintHandler.getHandler().onSubList(arg0, arg1);
    }

    @Override
    public void forEach(java.util.function.Consumer<? super E> arg0) {
        this.forEachConsumerHandler.getHandler().onForEach(arg0);
    }

    @Override
    public java.util.Spliterator<E> spliterator() {
        return this.spliteratorHandler.getHandler().onSpliterator();
    }

    @Override
    public boolean removeIf(java.util.function.Predicate<? super E> arg0) {
        return this.removeIfPredicateHandler.getHandler().onRemoveIf(arg0);
    }

    @Override
    public void replaceAll(java.util.function.UnaryOperator<E> arg0) {
        this.replaceAllUnaryOperatorHandler.getHandler().onReplaceAll(arg0);
    }

    @Override
    public void sort(java.util.Comparator<? super E> arg0) {
        this.sortComparatorHandler.getHandler().onSort(arg0);
    }

    @Override
    public boolean containsAll(java.util.Collection<?> arg0) {
        return this.containsAllCollectionHandler.getHandler().onContainsAll(arg0);
    }

    @Override
    public java.lang.String toString() {
        return this.toStringHandler.getHandler().onToString();
    }

    @FunctionalInterface
    public interface AddAllCollectionHandler<E> {
        boolean onAddAll( java.util.Collection<? extends E> arg0 );
    }

    @FunctionalInterface
    public interface AddAllintCollectionHandler<E> {
        boolean onAddAll( int arg0, java.util.Collection<? extends E> arg1 );
    }

    @FunctionalInterface
    public interface AddObjectHandler<E> {
        boolean onAdd( E arg0 );
    }

    @FunctionalInterface
    public interface AddintObjectHandler<E> {
        void onAdd( int arg0, E arg1 );
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
        boolean onContainsAll( java.util.Collection<?> arg0 );
    }

    @FunctionalInterface
    public interface ContainsObjectHandler {
        boolean onContains( java.lang.Object arg0 );
    }

    @FunctionalInterface
    public interface EnsureCapacityintHandler {
        void onEnsureCapacity( int arg0 );
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals( java.lang.Object arg0 );
    }

    @FunctionalInterface
    public interface ForEachConsumerHandler<E> {
        void onForEach( java.util.function.Consumer<? super E> arg0 );
    }

    @FunctionalInterface
    public interface GetintHandler<E> {
        E onGet( int arg0 );
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface IndexOfObjectHandler {
        int onIndexOf( java.lang.Object arg0 );
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
        int onLastIndexOf( java.lang.Object arg0 );
    }

    @FunctionalInterface
    public interface ListIteratorHandler<E> {
        java.util.ListIterator<E> onListIterator();
    }

    @FunctionalInterface
    public interface ListIteratorintHandler<E> {
        java.util.ListIterator<E> onListIterator( int arg0 );
    }

    @FunctionalInterface
    public interface ParallelStreamHandler<E> {
        java.util.stream.Stream<E> onParallelStream();
    }

    @FunctionalInterface
    public interface RemoveAllCollectionHandler {
        boolean onRemoveAll( java.util.Collection<?> arg0 );
    }

    @FunctionalInterface
    public interface RemoveIfPredicateHandler<E> {
        boolean onRemoveIf( java.util.function.Predicate<? super E> arg0 );
    }

    @FunctionalInterface
    public interface RemoveObjectHandler {
        boolean onRemove( java.lang.Object arg0 );
    }

    @FunctionalInterface
    public interface RemoveintHandler<E> {
        E onRemove( int arg0 );
    }

    @FunctionalInterface
    public interface ReplaceAllUnaryOperatorHandler<E> {
        void onReplaceAll( java.util.function.UnaryOperator<E> arg0 );
    }

    @FunctionalInterface
    public interface RetainAllCollectionHandler {
        boolean onRetainAll( java.util.Collection<?> arg0 );
    }

    @FunctionalInterface
    public interface SetintObjectHandler<E> {
        E onSet( int arg0, E arg1 );
    }

    @FunctionalInterface
    public interface SizeHandler {
        int onSize();
    }

    @FunctionalInterface
    public interface SortComparatorHandler<E> {
        void onSort( java.util.Comparator<? super E> arg0 );
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
    public interface SubListintintHandler<E> {
        java.util.List<E> onSubList( int arg0, int arg1 );
    }

    @FunctionalInterface
    public interface ToArrayHandler {
        java.lang.Object[] onToArray();
    }

    @FunctionalInterface
    public interface ToArrayIntFunctionHandler {
        <T> T[] onToArray( java.util.function.IntFunction<T[]> arg0 );
    }

    @FunctionalInterface
    public interface ToArrayObjectHandler {
        <T> T[] onToArray( T[] arg0 );
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