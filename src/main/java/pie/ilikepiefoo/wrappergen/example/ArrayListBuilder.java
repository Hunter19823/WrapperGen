package pie.ilikepiefoo.wrappergen.example;

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
public class ArrayListBuilder<E> {
    public AddAllCollectionHandler<E> addAllCollectionHandler;
    public AddAllIntCollectionHandler<E> addAllIntCollectionHandler;
    public AddIntObjectHandler<E> addIntObjectHandler;
    public AddObjectHandler<E> addObjectHandler;
    public ClearHandler clearHandler;
    public CloneHandler cloneHandler;
    public ContainsAllCollectionHandler containsAllCollectionHandler;
    public ContainsObjectHandler containsObjectHandler;
    public EnsureCapacityIntHandler ensureCapacityIntHandler;
    public EqualsObjectHandler equalsObjectHandler;
    public ForEachConsumerHandler<E> forEachConsumerHandler;
    public GetIntHandler<E> getIntHandler;
    public HashCodeHandler hashCodeHandler;
    public IndexOfObjectHandler indexOfObjectHandler;
    public IsEmptyHandler isEmptyHandler;
    public IteratorHandler<E> iteratorHandler;
    public LastIndexOfObjectHandler lastIndexOfObjectHandler;
    public ListIteratorHandler<E> listIteratorHandler;
    public ListIteratorIntHandler<E> listIteratorIntHandler;
    public ParallelStreamHandler<E> parallelStreamHandler;
    public RemoveAllCollectionHandler removeAllCollectionHandler;
    public RemoveIfPredicateHandler<E> removeIfPredicateHandler;
    public RemoveIntHandler<E> removeIntHandler;
    public RemoveObjectHandler removeObjectHandler;
    public ReplaceAllUnaryOperatorHandler<E> replaceAllUnaryOperatorHandler;
    public RetainAllCollectionHandler retainAllCollectionHandler;
    public SetIntObjectHandler<E> setIntObjectHandler;
    public SizeHandler sizeHandler;
    public SortComparatorHandler<E> sortComparatorHandler;
    public SpliteratorHandler<E> spliteratorHandler;
    public StreamHandler<E> streamHandler;
    public SubListIntIntHandler<E> subListIntIntHandler;
    public ToArrayHandler toArrayHandler;
    public ToArrayIntFunctionHandler toArrayIntFunctionHandler;
    public ToArrayObjectHandler toArrayObjectHandler;
    public ToStringHandler toStringHandler;
    public TrimToSizeHandler trimToSizeHandler;
    public ArrayListBuilder() {
    }

    public ArrayListBuilder<E> setAddAllCollectionHandler(AddAllCollectionHandler<E> addAllCollectionHandler) {
        this.addAllCollectionHandler = addAllCollectionHandler;
        return this;
    }
    public ArrayListBuilder<E> setAddAllIntCollectionHandler(AddAllIntCollectionHandler<E> addAllIntCollectionHandler) {
        this.addAllIntCollectionHandler = addAllIntCollectionHandler;
        return this;
    }
    public ArrayListBuilder<E> setAddIntObjectHandler(AddIntObjectHandler<E> addIntObjectHandler) {
        this.addIntObjectHandler = addIntObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setAddObjectHandler(AddObjectHandler<E> addObjectHandler) {
        this.addObjectHandler = addObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setClearHandler(ClearHandler clearHandler) {
        this.clearHandler = clearHandler;
        return this;
    }
    public ArrayListBuilder<E> setCloneHandler(CloneHandler cloneHandler) {
        this.cloneHandler = cloneHandler;
        return this;
    }
    public ArrayListBuilder<E> setContainsAllCollectionHandler(ContainsAllCollectionHandler containsAllCollectionHandler) {
        this.containsAllCollectionHandler = containsAllCollectionHandler;
        return this;
    }
    public ArrayListBuilder<E> setContainsObjectHandler(ContainsObjectHandler containsObjectHandler) {
        this.containsObjectHandler = containsObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setEnsureCapacityIntHandler(EnsureCapacityIntHandler ensureCapacityIntHandler) {
        this.ensureCapacityIntHandler = ensureCapacityIntHandler;
        return this;
    }
    public ArrayListBuilder<E> setEqualsObjectHandler(EqualsObjectHandler equalsObjectHandler) {
        this.equalsObjectHandler = equalsObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setForEachConsumerHandler(ForEachConsumerHandler<E> forEachConsumerHandler) {
        this.forEachConsumerHandler = forEachConsumerHandler;
        return this;
    }
    public ArrayListBuilder<E> setGetIntHandler(GetIntHandler<E> getIntHandler) {
        this.getIntHandler = getIntHandler;
        return this;
    }
    public ArrayListBuilder<E> setHashCodeHandler(HashCodeHandler hashCodeHandler) {
        this.hashCodeHandler = hashCodeHandler;
        return this;
    }
    public ArrayListBuilder<E> setIndexOfObjectHandler(IndexOfObjectHandler indexOfObjectHandler) {
        this.indexOfObjectHandler = indexOfObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setIsEmptyHandler(IsEmptyHandler isEmptyHandler) {
        this.isEmptyHandler = isEmptyHandler;
        return this;
    }
    public ArrayListBuilder<E> setIteratorHandler(IteratorHandler<E> iteratorHandler) {
        this.iteratorHandler = iteratorHandler;
        return this;
    }
    public ArrayListBuilder<E> setLastIndexOfObjectHandler(LastIndexOfObjectHandler lastIndexOfObjectHandler) {
        this.lastIndexOfObjectHandler = lastIndexOfObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setListIteratorHandler(ListIteratorHandler<E> listIteratorHandler) {
        this.listIteratorHandler = listIteratorHandler;
        return this;
    }
    public ArrayListBuilder<E> setListIteratorIntHandler(ListIteratorIntHandler<E> listIteratorIntHandler) {
        this.listIteratorIntHandler = listIteratorIntHandler;
        return this;
    }
    public ArrayListBuilder<E> setParallelStreamHandler(ParallelStreamHandler<E> parallelStreamHandler) {
        this.parallelStreamHandler = parallelStreamHandler;
        return this;
    }
    public ArrayListBuilder<E> setRemoveAllCollectionHandler(RemoveAllCollectionHandler removeAllCollectionHandler) {
        this.removeAllCollectionHandler = removeAllCollectionHandler;
        return this;
    }
    public ArrayListBuilder<E> setRemoveIfPredicateHandler(RemoveIfPredicateHandler<E> removeIfPredicateHandler) {
        this.removeIfPredicateHandler = removeIfPredicateHandler;
        return this;
    }
    public ArrayListBuilder<E> setRemoveIntHandler(RemoveIntHandler<E> removeIntHandler) {
        this.removeIntHandler = removeIntHandler;
        return this;
    }
    public ArrayListBuilder<E> setRemoveObjectHandler(RemoveObjectHandler removeObjectHandler) {
        this.removeObjectHandler = removeObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setReplaceAllUnaryOperatorHandler(ReplaceAllUnaryOperatorHandler<E> replaceAllUnaryOperatorHandler) {
        this.replaceAllUnaryOperatorHandler = replaceAllUnaryOperatorHandler;
        return this;
    }
    public ArrayListBuilder<E> setRetainAllCollectionHandler(RetainAllCollectionHandler retainAllCollectionHandler) {
        this.retainAllCollectionHandler = retainAllCollectionHandler;
        return this;
    }
    public ArrayListBuilder<E> setSetIntObjectHandler(SetIntObjectHandler<E> setIntObjectHandler) {
        this.setIntObjectHandler = setIntObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setSizeHandler(SizeHandler sizeHandler) {
        this.sizeHandler = sizeHandler;
        return this;
    }
    public ArrayListBuilder<E> setSortComparatorHandler(SortComparatorHandler<E> sortComparatorHandler) {
        this.sortComparatorHandler = sortComparatorHandler;
        return this;
    }
    public ArrayListBuilder<E> setSpliteratorHandler(SpliteratorHandler<E> spliteratorHandler) {
        this.spliteratorHandler = spliteratorHandler;
        return this;
    }
    public ArrayListBuilder<E> setStreamHandler(StreamHandler<E> streamHandler) {
        this.streamHandler = streamHandler;
        return this;
    }
    public ArrayListBuilder<E> setSubListIntIntHandler(SubListIntIntHandler<E> subListIntIntHandler) {
        this.subListIntIntHandler = subListIntIntHandler;
        return this;
    }
    public ArrayListBuilder<E> setToArrayHandler(ToArrayHandler toArrayHandler) {
        this.toArrayHandler = toArrayHandler;
        return this;
    }
    public ArrayListBuilder<E> setToArrayIntFunctionHandler(ToArrayIntFunctionHandler toArrayIntFunctionHandler) {
        this.toArrayIntFunctionHandler = toArrayIntFunctionHandler;
        return this;
    }
    public ArrayListBuilder<E> setToArrayObjectHandler(ToArrayObjectHandler toArrayObjectHandler) {
        this.toArrayObjectHandler = toArrayObjectHandler;
        return this;
    }
    public ArrayListBuilder<E> setToStringHandler(ToStringHandler toStringHandler) {
        this.toStringHandler = toStringHandler;
        return this;
    }
    public ArrayListBuilder<E> setTrimToSizeHandler(TrimToSizeHandler trimToSizeHandler) {
        this.trimToSizeHandler = trimToSizeHandler;
        return this;
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
