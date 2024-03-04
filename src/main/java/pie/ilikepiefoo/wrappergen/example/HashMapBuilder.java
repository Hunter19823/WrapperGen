package pie.ilikepiefoo.wrappergen.example;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashMapBuilder<K, V> {
    public ClearHandler clearHandler;
    public CloneHandler cloneHandler;
    public ComputeIfAbsentObjectFunctionHandler<K, V> computeIfAbsentObjectFunctionHandler;
    public ComputeIfPresentObjectBiFunctionHandler<K, V> computeIfPresentObjectBiFunctionHandler;
    public ComputeObjectBiFunctionHandler<K, V> computeObjectBiFunctionHandler;
    public ContainsKeyObjectHandler containsKeyObjectHandler;
    public ContainsValueObjectHandler containsValueObjectHandler;
    public EntrySetHandler<V, K> entrySetHandler;
    public EqualsObjectHandler equalsObjectHandler;
    public ForEachBiConsumerHandler<V, K> forEachBiConsumerHandler;
    public GetObjectHandler<V> getObjectHandler;
    public GetOrDefaultObjectObjectHandler<V> getOrDefaultObjectObjectHandler;
    public HashCodeHandler hashCodeHandler;
    public IsEmptyHandler isEmptyHandler;
    public KeySetHandler<K> keySetHandler;
    public MergeObjectObjectBiFunctionHandler<K, V> mergeObjectObjectBiFunctionHandler;
    public PutAllMapHandler<V, K> putAllMapHandler;
    public PutIfAbsentObjectObjectHandler<K, V> putIfAbsentObjectObjectHandler;
    public PutObjectObjectHandler<K, V> putObjectObjectHandler;
    public RemoveObjectHandler<V> removeObjectHandler;
    public RemoveObjectObjectHandler removeObjectObjectHandler;
    public ReplaceAllBiFunctionHandler<V, K> replaceAllBiFunctionHandler;
    public ReplaceObjectObjectHandler<K, V> replaceObjectObjectHandler;
    public ReplaceObjectObjectObjectHandler<K, V> replaceObjectObjectObjectHandler;
    public SizeHandler sizeHandler;
    public ToStringHandler toStringHandler;
    public ValuesHandler<V> valuesHandler;

    public HashMapBuilder() {
    }

    public HashMapBuilder<K, V> setClearHandler(ClearHandler clearHandler) {
        this.clearHandler = clearHandler;
        return this;
    }

    public HashMapBuilder<K, V> setCloneHandler(CloneHandler cloneHandler) {
        this.cloneHandler = cloneHandler;
        return this;
    }

    public HashMapBuilder<K, V> setComputeIfAbsentObjectFunctionHandler(ComputeIfAbsentObjectFunctionHandler<K, V> computeIfAbsentObjectFunctionHandler) {
        this.computeIfAbsentObjectFunctionHandler = computeIfAbsentObjectFunctionHandler;
        return this;
    }

    public HashMapBuilder<K, V> setComputeIfPresentObjectBiFunctionHandler(ComputeIfPresentObjectBiFunctionHandler<K, V> computeIfPresentObjectBiFunctionHandler) {
        this.computeIfPresentObjectBiFunctionHandler = computeIfPresentObjectBiFunctionHandler;
        return this;
    }

    public HashMapBuilder<K, V> setComputeObjectBiFunctionHandler(ComputeObjectBiFunctionHandler<K, V> computeObjectBiFunctionHandler) {
        this.computeObjectBiFunctionHandler = computeObjectBiFunctionHandler;
        return this;
    }

    public HashMapBuilder<K, V> setContainsKeyObjectHandler(ContainsKeyObjectHandler containsKeyObjectHandler) {
        this.containsKeyObjectHandler = containsKeyObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setContainsValueObjectHandler(ContainsValueObjectHandler containsValueObjectHandler) {
        this.containsValueObjectHandler = containsValueObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setEntrySetHandler(EntrySetHandler<V, K> entrySetHandler) {
        this.entrySetHandler = entrySetHandler;
        return this;
    }

    public HashMapBuilder<K, V> setEqualsObjectHandler(EqualsObjectHandler equalsObjectHandler) {
        this.equalsObjectHandler = equalsObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setForEachBiConsumerHandler(ForEachBiConsumerHandler<V, K> forEachBiConsumerHandler) {
        this.forEachBiConsumerHandler = forEachBiConsumerHandler;
        return this;
    }

    public HashMapBuilder<K, V> setGetObjectHandler(GetObjectHandler<V> getObjectHandler) {
        this.getObjectHandler = getObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setGetOrDefaultObjectObjectHandler(GetOrDefaultObjectObjectHandler<V> getOrDefaultObjectObjectHandler) {
        this.getOrDefaultObjectObjectHandler = getOrDefaultObjectObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setHashCodeHandler(HashCodeHandler hashCodeHandler) {
        this.hashCodeHandler = hashCodeHandler;
        return this;
    }

    public HashMapBuilder<K, V> setIsEmptyHandler(IsEmptyHandler isEmptyHandler) {
        this.isEmptyHandler = isEmptyHandler;
        return this;
    }

    public HashMapBuilder<K, V> setKeySetHandler(KeySetHandler<K> keySetHandler) {
        this.keySetHandler = keySetHandler;
        return this;
    }

    public HashMapBuilder<K, V> setMergeObjectObjectBiFunctionHandler(MergeObjectObjectBiFunctionHandler<K, V> mergeObjectObjectBiFunctionHandler) {
        this.mergeObjectObjectBiFunctionHandler = mergeObjectObjectBiFunctionHandler;
        return this;
    }

    public HashMapBuilder<K, V> setPutAllMapHandler(PutAllMapHandler<V, K> putAllMapHandler) {
        this.putAllMapHandler = putAllMapHandler;
        return this;
    }

    public HashMapBuilder<K, V> setPutIfAbsentObjectObjectHandler(PutIfAbsentObjectObjectHandler<K, V> putIfAbsentObjectObjectHandler) {
        this.putIfAbsentObjectObjectHandler = putIfAbsentObjectObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setPutObjectObjectHandler(PutObjectObjectHandler<K, V> putObjectObjectHandler) {
        this.putObjectObjectHandler = putObjectObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setRemoveObjectHandler(RemoveObjectHandler<V> removeObjectHandler) {
        this.removeObjectHandler = removeObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setRemoveObjectObjectHandler(RemoveObjectObjectHandler removeObjectObjectHandler) {
        this.removeObjectObjectHandler = removeObjectObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setReplaceAllBiFunctionHandler(ReplaceAllBiFunctionHandler<V, K> replaceAllBiFunctionHandler) {
        this.replaceAllBiFunctionHandler = replaceAllBiFunctionHandler;
        return this;
    }

    public HashMapBuilder<K, V> setReplaceObjectObjectHandler(ReplaceObjectObjectHandler<K, V> replaceObjectObjectHandler) {
        this.replaceObjectObjectHandler = replaceObjectObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setReplaceObjectObjectObjectHandler(ReplaceObjectObjectObjectHandler<K, V> replaceObjectObjectObjectHandler) {
        this.replaceObjectObjectObjectHandler = replaceObjectObjectObjectHandler;
        return this;
    }

    public HashMapBuilder<K, V> setSizeHandler(SizeHandler sizeHandler) {
        this.sizeHandler = sizeHandler;
        return this;
    }

    public HashMapBuilder<K, V> setToStringHandler(ToStringHandler toStringHandler) {
        this.toStringHandler = toStringHandler;
        return this;
    }

    public HashMapBuilder<K, V> setValuesHandler(ValuesHandler<V> valuesHandler) {
        this.valuesHandler = valuesHandler;
        return this;
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
    public interface ComputeIfAbsentObjectFunctionHandler<K, V> {
        V onComputeIfAbsent(K arg0, Function<? super K, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ComputeIfPresentObjectBiFunctionHandler<K, V> {
        V onComputeIfPresent(K arg0, BiFunction<? super K, ? super V, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ComputeObjectBiFunctionHandler<K, V> {
        V onCompute(K arg0, BiFunction<? super K, ? super V, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ContainsKeyObjectHandler {
        boolean onContainsKey(Object arg0);
    }

    @FunctionalInterface
    public interface ContainsValueObjectHandler {
        boolean onContainsValue(Object arg0);
    }

    @FunctionalInterface
    public interface EntrySetHandler<V, K> {
        Set<Entry<K, V>> onEntrySet();
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(Object arg0);
    }

    @FunctionalInterface
    public interface ForEachBiConsumerHandler<V, K> {
        void onForEach(BiConsumer<? super K, ? super V> arg0);
    }

    @FunctionalInterface
    public interface GetObjectHandler<V> {
        V onGet(Object arg0);
    }

    @FunctionalInterface
    public interface GetOrDefaultObjectObjectHandler<V> {
        V onGetOrDefault(Object arg0, V arg1);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface KeySetHandler<K> {
        Set<K> onKeySet();
    }

    @FunctionalInterface
    public interface MergeObjectObjectBiFunctionHandler<K, V> {
        V onMerge(K arg0, V arg1, BiFunction<? super V, ? super V, ? extends V> arg2);
    }

    @FunctionalInterface
    public interface PutAllMapHandler<V, K> {
        void onPutAll(Map<? extends K, ? extends V> arg0);
    }

    @FunctionalInterface
    public interface PutIfAbsentObjectObjectHandler<K, V> {
        V onPutIfAbsent(K arg0, V arg1);
    }

    @FunctionalInterface
    public interface PutObjectObjectHandler<K, V> {
        V onPut(K arg0, V arg1);
    }

    @FunctionalInterface
    public interface RemoveObjectHandler<V> {
        V onRemove(Object arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectObjectHandler {
        boolean onRemove(Object arg0, Object arg1);
    }

    @FunctionalInterface
    public interface ReplaceAllBiFunctionHandler<V, K> {
        void onReplaceAll(BiFunction<? super K, ? super V, ? extends V> arg0);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectHandler<K, V> {
        V onReplace(K arg0, V arg1);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectObjectHandler<K, V> {
        boolean onReplace(K arg0, V arg1, V arg2);
    }

    @FunctionalInterface
    public interface SizeHandler {
        int onSize();
    }

    @FunctionalInterface
    public interface ToStringHandler {
        String onToString();
    }

    @FunctionalInterface
    public interface ValuesHandler<V> {
        Collection<V> onValues();
    }

}
