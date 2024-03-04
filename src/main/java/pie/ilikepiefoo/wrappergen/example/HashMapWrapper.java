package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
import pie.ilikepiefoo.wrappergen.util.MethodHotSwapHandler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashMapWrapper<K, V> extends HashMap<K, V> {
    public MethodHandler<ClearHandler> clearHandler = new MethodHotSwapHandler<>(super::clear);
    public MethodHandler<CloneHandler> cloneHandler = new MethodHotSwapHandler<>(super::clone);
    public MethodHandler<ComputeIfAbsentObjectFunctionHandler<K, V>> computeIfAbsentObjectFunctionHandler = new MethodHotSwapHandler<>(super::computeIfAbsent);
    public MethodHandler<ComputeIfPresentObjectBiFunctionHandler<K, V>> computeIfPresentObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::computeIfPresent);
    public MethodHandler<ComputeObjectBiFunctionHandler<K, V>> computeObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::compute);
    public MethodHandler<ContainsKeyObjectHandler> containsKeyObjectHandler = new MethodHotSwapHandler<>(super::containsKey);
    public MethodHandler<ContainsValueObjectHandler> containsValueObjectHandler = new MethodHotSwapHandler<>(super::containsValue);
    public MethodHandler<EntrySetHandler<V, K>> entrySetHandler = new MethodHotSwapHandler<>(super::entrySet);
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler = new MethodHotSwapHandler<>(super::equals);
    public MethodHandler<ForEachBiConsumerHandler<V, K>> forEachBiConsumerHandler = new MethodHotSwapHandler<>(super::forEach);
    public MethodHandler<GetObjectHandler<V>> getObjectHandler = new MethodHotSwapHandler<>(super::get);
    public MethodHandler<GetOrDefaultObjectObjectHandler<V>> getOrDefaultObjectObjectHandler = new MethodHotSwapHandler<>(super::getOrDefault);
    public MethodHandler<HashCodeHandler> hashCodeHandler = new MethodHotSwapHandler<>(super::hashCode);
    public MethodHandler<IsEmptyHandler> isEmptyHandler = new MethodHotSwapHandler<>(super::isEmpty);
    public MethodHandler<KeySetHandler<K>> keySetHandler = new MethodHotSwapHandler<>(super::keySet);
    public MethodHandler<MergeObjectObjectBiFunctionHandler<K, V>> mergeObjectObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::merge);
    public MethodHandler<PutAllMapHandler<V, K>> putAllMapHandler = new MethodHotSwapHandler<>(super::putAll);
    public MethodHandler<PutIfAbsentObjectObjectHandler<K, V>> putIfAbsentObjectObjectHandler = new MethodHotSwapHandler<>(super::putIfAbsent);
    public MethodHandler<PutObjectObjectHandler<K, V>> putObjectObjectHandler = new MethodHotSwapHandler<>(super::put);
    public MethodHandler<RemoveObjectHandler<V>> removeObjectHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<RemoveObjectObjectHandler> removeObjectObjectHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<ReplaceAllBiFunctionHandler<V, K>> replaceAllBiFunctionHandler = new MethodHotSwapHandler<>(super::replaceAll);
    public MethodHandler<ReplaceObjectObjectHandler<K, V>> replaceObjectObjectHandler = new MethodHotSwapHandler<>(super::replace);
    public MethodHandler<ReplaceObjectObjectObjectHandler<K, V>> replaceObjectObjectObjectHandler = new MethodHotSwapHandler<>(super::replace);
    public MethodHandler<SizeHandler> sizeHandler = new MethodHotSwapHandler<>(super::size);
    public MethodHandler<ToStringHandler> toStringHandler = new MethodHotSwapHandler<>(super::toString);
    public MethodHandler<ValuesHandler<V>> valuesHandler = new MethodHotSwapHandler<>(super::values);

    public HashMapWrapper(int arg0) {
        super(arg0);
    }

    public HashMapWrapper(int arg0, float arg1) {
        super(arg0, arg1);
    }

    public HashMapWrapper(Map<? extends K, ? extends V> arg0) {
        super(arg0);
    }

    public HashMapWrapper() {
        super();
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
    public String toString() {
        return (this.toStringHandler != null && this.toStringHandler.getHandler() != null) ? this.toStringHandler.getHandler().onToString() : super.toString();
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
    public V get(Object arg0) {
        return (this.getObjectHandler != null && this.getObjectHandler.getHandler() != null) ? this.getObjectHandler.getHandler().onGet(arg0) : super.get(arg0);
    }

    @Override
    public boolean containsKey(Object arg0) {
        return (this.containsKeyObjectHandler != null && this.containsKeyObjectHandler.getHandler() != null) ? this.containsKeyObjectHandler.getHandler().onContainsKey(arg0) : super.containsKey(arg0);
    }

    @Override
    public V put(K arg0, V arg1) {
        return (this.putObjectObjectHandler != null && this.putObjectObjectHandler.getHandler() != null) ? this.putObjectObjectHandler.getHandler().onPut(arg0, arg1) : super.put(arg0, arg1);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> arg0) {
        if (this.putAllMapHandler != null && this.putAllMapHandler.getHandler() != null) {
            this.putAllMapHandler.getHandler().onPutAll(arg0);
        } else {
            super.putAll(arg0);
        }
    }

    @Override
    public V remove(Object arg0) {
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
    public boolean containsValue(Object arg0) {
        return (this.containsValueObjectHandler != null && this.containsValueObjectHandler.getHandler() != null) ? this.containsValueObjectHandler.getHandler().onContainsValue(arg0) : super.containsValue(arg0);
    }

    @Override
    public Set<K> keySet() {
        return (this.keySetHandler != null && this.keySetHandler.getHandler() != null) ? this.keySetHandler.getHandler().onKeySet() : super.keySet();
    }

    @Override
    public Collection<V> values() {
        return (this.valuesHandler != null && this.valuesHandler.getHandler() != null) ? this.valuesHandler.getHandler().onValues() : super.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return (this.entrySetHandler != null && this.entrySetHandler.getHandler() != null) ? this.entrySetHandler.getHandler().onEntrySet() : super.entrySet();
    }

    @Override
    public V getOrDefault(Object arg0, V arg1) {
        return (this.getOrDefaultObjectObjectHandler != null && this.getOrDefaultObjectObjectHandler.getHandler() != null) ? this.getOrDefaultObjectObjectHandler.getHandler().onGetOrDefault(arg0, arg1) : super.getOrDefault(arg0, arg1);
    }

    @Override
    public V putIfAbsent(K arg0, V arg1) {
        return (this.putIfAbsentObjectObjectHandler != null && this.putIfAbsentObjectObjectHandler.getHandler() != null) ? this.putIfAbsentObjectObjectHandler.getHandler().onPutIfAbsent(arg0, arg1) : super.putIfAbsent(arg0, arg1);
    }

    @Override
    public boolean remove(Object arg0, Object arg1) {
        return (this.removeObjectObjectHandler != null && this.removeObjectObjectHandler.getHandler() != null) ? this.removeObjectObjectHandler.getHandler().onRemove(arg0, arg1) : super.remove(arg0, arg1);
    }

    @Override
    public boolean replace(K arg0, V arg1, V arg2) {
        return (this.replaceObjectObjectObjectHandler != null && this.replaceObjectObjectObjectHandler.getHandler() != null) ? this.replaceObjectObjectObjectHandler.getHandler().onReplace(arg0, arg1, arg2) : super.replace(arg0, arg1, arg2);
    }

    @Override
    public V replace(K arg0, V arg1) {
        return (this.replaceObjectObjectHandler != null && this.replaceObjectObjectHandler.getHandler() != null) ? this.replaceObjectObjectHandler.getHandler().onReplace(arg0, arg1) : super.replace(arg0, arg1);
    }

    @Override
    public V computeIfAbsent(K arg0, Function<? super K, ? extends V> arg1) {
        return (this.computeIfAbsentObjectFunctionHandler != null && this.computeIfAbsentObjectFunctionHandler.getHandler() != null) ? this.computeIfAbsentObjectFunctionHandler.getHandler().onComputeIfAbsent(arg0, arg1) : super.computeIfAbsent(arg0, arg1);
    }

    @Override
    public V computeIfPresent(K arg0, BiFunction<? super K, ? super V, ? extends V> arg1) {
        return (this.computeIfPresentObjectBiFunctionHandler != null && this.computeIfPresentObjectBiFunctionHandler.getHandler() != null) ? this.computeIfPresentObjectBiFunctionHandler.getHandler().onComputeIfPresent(arg0, arg1) : super.computeIfPresent(arg0, arg1);
    }

    @Override
    public V compute(K arg0, BiFunction<? super K, ? super V, ? extends V> arg1) {
        return (this.computeObjectBiFunctionHandler != null && this.computeObjectBiFunctionHandler.getHandler() != null) ? this.computeObjectBiFunctionHandler.getHandler().onCompute(arg0, arg1) : super.compute(arg0, arg1);
    }

    @Override
    public V merge(K arg0, V arg1, BiFunction<? super V, ? super V, ? extends V> arg2) {
        return (this.mergeObjectObjectBiFunctionHandler != null && this.mergeObjectObjectBiFunctionHandler.getHandler() != null) ? this.mergeObjectObjectBiFunctionHandler.getHandler().onMerge(arg0, arg1, arg2) : super.merge(arg0, arg1, arg2);
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> arg0) {
        if (this.forEachBiConsumerHandler != null && this.forEachBiConsumerHandler.getHandler() != null) {
            this.forEachBiConsumerHandler.getHandler().onForEach(arg0);
        } else {
            super.forEach(arg0);
        }
    }

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> arg0) {
        if (this.replaceAllBiFunctionHandler != null && this.replaceAllBiFunctionHandler.getHandler() != null) {
            this.replaceAllBiFunctionHandler.getHandler().onReplaceAll(arg0);
        } else {
            super.replaceAll(arg0);
        }
    }

    @Override
    public Object clone() {
        return (this.cloneHandler != null && this.cloneHandler.getHandler() != null) ? this.cloneHandler.getHandler().onClone() : super.clone();
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
