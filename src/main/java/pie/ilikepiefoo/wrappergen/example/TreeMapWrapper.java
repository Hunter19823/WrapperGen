package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
import pie.ilikepiefoo.wrappergen.util.MethodHotSwapHandler;

import java.util.TreeMap;
public class TreeMapWrapper<K, V> extends TreeMap<K, V> {
    public MethodHandler<CeilingEntryObjectHandler<K, V>> ceilingEntryObjectHandler = new MethodHotSwapHandler<>(super::ceilingEntry);
    public MethodHandler<CeilingKeyObjectHandler<K>> ceilingKeyObjectHandler = new MethodHotSwapHandler<>(super::ceilingKey);
    public MethodHandler<ClearHandler> clearHandler = new MethodHotSwapHandler<>(super::clear);
    public MethodHandler<CloneHandler> cloneHandler = new MethodHotSwapHandler<>(super::clone);
    public MethodHandler<ComparatorHandler<K>> comparatorHandler = new MethodHotSwapHandler<>(super::comparator);
    public MethodHandler<ComputeIfAbsentObjectFunctionHandler<K, V>> computeIfAbsentObjectFunctionHandler = new MethodHotSwapHandler<>(super::computeIfAbsent);
    public MethodHandler<ComputeIfPresentObjectBiFunctionHandler<K, V>> computeIfPresentObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::computeIfPresent);
    public MethodHandler<ComputeObjectBiFunctionHandler<K, V>> computeObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::compute);
    public MethodHandler<ContainsKeyObjectHandler> containsKeyObjectHandler = new MethodHotSwapHandler<>(super::containsKey);
    public MethodHandler<ContainsValueObjectHandler> containsValueObjectHandler = new MethodHotSwapHandler<>(super::containsValue);
    public MethodHandler<DescendingKeySetHandler<K>> descendingKeySetHandler = new MethodHotSwapHandler<>(super::descendingKeySet);
    public MethodHandler<DescendingMapHandler<V, K>> descendingMapHandler = new MethodHotSwapHandler<>(super::descendingMap);
    public MethodHandler<EntrySetHandler<V, K>> entrySetHandler = new MethodHotSwapHandler<>(super::entrySet);
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler = new MethodHotSwapHandler<>(super::equals);
    public MethodHandler<FirstEntryHandler<V, K>> firstEntryHandler = new MethodHotSwapHandler<>(super::firstEntry);
    public MethodHandler<FirstKeyHandler<K>> firstKeyHandler = new MethodHotSwapHandler<>(super::firstKey);
    public MethodHandler<FloorEntryObjectHandler<K, V>> floorEntryObjectHandler = new MethodHotSwapHandler<>(super::floorEntry);
    public MethodHandler<FloorKeyObjectHandler<K>> floorKeyObjectHandler = new MethodHotSwapHandler<>(super::floorKey);
    public MethodHandler<ForEachBiConsumerHandler<V, K>> forEachBiConsumerHandler = new MethodHotSwapHandler<>(super::forEach);
    public MethodHandler<GetObjectHandler<V>> getObjectHandler = new MethodHotSwapHandler<>(super::get);
    public MethodHandler<GetOrDefaultObjectObjectHandler<V>> getOrDefaultObjectObjectHandler = new MethodHotSwapHandler<>(super::getOrDefault);
    public MethodHandler<HashCodeHandler> hashCodeHandler = new MethodHotSwapHandler<>(super::hashCode);
    public MethodHandler<HeadMapObjectBooleanHandler<K, V>> headMapObjectBooleanHandler = new MethodHotSwapHandler<>(super::headMap);
    public MethodHandler<HeadMapObjectHandler<K, V>> headMapObjectHandler = new MethodHotSwapHandler<>(super::headMap);
    public MethodHandler<HigherEntryObjectHandler<K, V>> higherEntryObjectHandler = new MethodHotSwapHandler<>(super::higherEntry);
    public MethodHandler<HigherKeyObjectHandler<K>> higherKeyObjectHandler = new MethodHotSwapHandler<>(super::higherKey);
    public MethodHandler<IsEmptyHandler> isEmptyHandler = new MethodHotSwapHandler<>(super::isEmpty);
    public MethodHandler<KeySetHandler<K>> keySetHandler = new MethodHotSwapHandler<>(super::keySet);
    public MethodHandler<LastEntryHandler<V, K>> lastEntryHandler = new MethodHotSwapHandler<>(super::lastEntry);
    public MethodHandler<LastKeyHandler<K>> lastKeyHandler = new MethodHotSwapHandler<>(super::lastKey);
    public MethodHandler<LowerEntryObjectHandler<K, V>> lowerEntryObjectHandler = new MethodHotSwapHandler<>(super::lowerEntry);
    public MethodHandler<LowerKeyObjectHandler<K>> lowerKeyObjectHandler = new MethodHotSwapHandler<>(super::lowerKey);
    public MethodHandler<MergeObjectObjectBiFunctionHandler<K, V>> mergeObjectObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::merge);
    public MethodHandler<NavigableKeySetHandler<K>> navigableKeySetHandler = new MethodHotSwapHandler<>(super::navigableKeySet);
    public MethodHandler<PollFirstEntryHandler<V, K>> pollFirstEntryHandler = new MethodHotSwapHandler<>(super::pollFirstEntry);
    public MethodHandler<PollLastEntryHandler<V, K>> pollLastEntryHandler = new MethodHotSwapHandler<>(super::pollLastEntry);
    public MethodHandler<PutAllMapHandler<V, K>> putAllMapHandler = new MethodHotSwapHandler<>(super::putAll);
    public MethodHandler<PutIfAbsentObjectObjectHandler<K, V>> putIfAbsentObjectObjectHandler = new MethodHotSwapHandler<>(super::putIfAbsent);
    public MethodHandler<PutObjectObjectHandler<K, V>> putObjectObjectHandler = new MethodHotSwapHandler<>(super::put);
    public MethodHandler<RemoveObjectHandler<V>> removeObjectHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<RemoveObjectObjectHandler> removeObjectObjectHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<ReplaceAllBiFunctionHandler<V, K>> replaceAllBiFunctionHandler = new MethodHotSwapHandler<>(super::replaceAll);
    public MethodHandler<ReplaceObjectObjectHandler<K, V>> replaceObjectObjectHandler = new MethodHotSwapHandler<>(super::replace);
    public MethodHandler<ReplaceObjectObjectObjectHandler<K, V>> replaceObjectObjectObjectHandler = new MethodHotSwapHandler<>(super::replace);
    public MethodHandler<SizeHandler> sizeHandler = new MethodHotSwapHandler<>(super::size);
    public MethodHandler<SubMapObjectBooleanObjectBooleanHandler<K, V>> subMapObjectBooleanObjectBooleanHandler = new MethodHotSwapHandler<>(super::subMap);
    public MethodHandler<SubMapObjectObjectHandler<K, V>> subMapObjectObjectHandler = new MethodHotSwapHandler<>(super::subMap);
    public MethodHandler<TailMapObjectBooleanHandler<K, V>> tailMapObjectBooleanHandler = new MethodHotSwapHandler<>(super::tailMap);
    public MethodHandler<TailMapObjectHandler<K, V>> tailMapObjectHandler = new MethodHotSwapHandler<>(super::tailMap);
    public MethodHandler<ToStringHandler> toStringHandler = new MethodHotSwapHandler<>(super::toString);
    public MethodHandler<ValuesHandler<V>> valuesHandler = new MethodHotSwapHandler<>(super::values);
    public TreeMapWrapper(java.util.SortedMap<K, ? extends V> arg0) {
        super(arg0);
    }

    public TreeMapWrapper(java.util.Map<? extends K, ? extends V> arg0) {
        super(arg0);
    }

    public TreeMapWrapper(java.util.Comparator<? super K> arg0) {
        super(arg0);
    }

    public TreeMapWrapper() {
        super();
    }

    @Override
    public V getOrDefault(java.lang.Object arg0, V arg1) {
        return (this.getOrDefaultObjectObjectHandler != null && this.getOrDefaultObjectObjectHandler.getHandler() != null) ? this.getOrDefaultObjectObjectHandler.getHandler().onGetOrDefault(arg0, arg1) : super.getOrDefault(arg0, arg1);
    }

    @Override
    public boolean remove(java.lang.Object arg0, java.lang.Object arg1) {
        return (this.removeObjectObjectHandler != null && this.removeObjectObjectHandler.getHandler() != null) ? this.removeObjectObjectHandler.getHandler().onRemove(arg0, arg1) : super.remove(arg0, arg1);
    }

    @Override
    public boolean isEmpty() {
        return (this.isEmptyHandler != null && this.isEmptyHandler.getHandler() != null) ? this.isEmptyHandler.getHandler().onIsEmpty() : super.isEmpty();
    }

    @Override
    public boolean equals(java.lang.Object arg0) {
        return (this.equalsObjectHandler != null && this.equalsObjectHandler.getHandler() != null) ? this.equalsObjectHandler.getHandler().onEquals(arg0) : super.equals(arg0);
    }
    @Override
    public java.util.Comparator<? super K> comparator() {
        return (this.comparatorHandler != null && this.comparatorHandler.getHandler() != null) ? this.comparatorHandler.getHandler().onComparator() : super.comparator();
    }

    @Override
    public int hashCode() {
        return (this.hashCodeHandler != null && this.hashCodeHandler.getHandler() != null) ? this.hashCodeHandler.getHandler().onHashCode() : super.hashCode();
    }
    @Override
    public V computeIfAbsent(K arg0, java.util.function.Function<? super K, ? extends V> arg1) {
        return (this.computeIfAbsentObjectFunctionHandler != null && this.computeIfAbsentObjectFunctionHandler.getHandler() != null) ? this.computeIfAbsentObjectFunctionHandler.getHandler().onComputeIfAbsent(arg0, arg1) : super.computeIfAbsent(arg0, arg1);
    }
    @Override
    public V computeIfPresent(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1) {
        return (this.computeIfPresentObjectBiFunctionHandler != null && this.computeIfPresentObjectBiFunctionHandler.getHandler() != null) ? this.computeIfPresentObjectBiFunctionHandler.getHandler().onComputeIfPresent(arg0, arg1) : super.computeIfPresent(arg0, arg1);
    }
    @Override
    public boolean containsKey(java.lang.Object arg0) {
        return (this.containsKeyObjectHandler != null && this.containsKeyObjectHandler.getHandler() != null) ? this.containsKeyObjectHandler.getHandler().onContainsKey(arg0) : super.containsKey(arg0);
    }
    @Override
    public boolean containsValue(java.lang.Object arg0) {
        return (this.containsValueObjectHandler != null && this.containsValueObjectHandler.getHandler() != null) ? this.containsValueObjectHandler.getHandler().onContainsValue(arg0) : super.containsValue(arg0);
    }

    @Override
    public java.lang.String toString() {
        return (this.toStringHandler != null && this.toStringHandler.getHandler() != null) ? this.toStringHandler.getHandler().onToString() : super.toString();
    }

    @Override
    public int size() {
        return (this.sizeHandler != null && this.sizeHandler.getHandler() != null) ? this.sizeHandler.getHandler().onSize() : super.size();
    }

    @Override
    public V get(java.lang.Object arg0) {
        return (this.getObjectHandler != null && this.getObjectHandler.getHandler() != null) ? this.getObjectHandler.getHandler().onGet(arg0) : super.get(arg0);
    }

    @Override
    public K firstKey() {
        return (this.firstKeyHandler != null && this.firstKeyHandler.getHandler() != null) ? this.firstKeyHandler.getHandler().onFirstKey() : super.firstKey();
    }
    @Override
    public java.util.Map.Entry<K, V> firstEntry() {
        return (this.firstEntryHandler != null && this.firstEntryHandler.getHandler() != null) ? this.firstEntryHandler.getHandler().onFirstEntry() : super.firstEntry();
    }

    @Override
    public K lastKey() {
        return (this.lastKeyHandler != null && this.lastKeyHandler.getHandler() != null) ? this.lastKeyHandler.getHandler().onLastKey() : super.lastKey();
    }
    @Override
    public java.util.Map.Entry<K, V> floorEntry(K arg0) {
        return (this.floorEntryObjectHandler != null && this.floorEntryObjectHandler.getHandler() != null) ? this.floorEntryObjectHandler.getHandler().onFloorEntry(arg0) : super.floorEntry(arg0);
    }
    @Override
    public K floorKey(K arg0) {
        return (this.floorKeyObjectHandler != null && this.floorKeyObjectHandler.getHandler() != null) ? this.floorKeyObjectHandler.getHandler().onFloorKey(arg0) : super.floorKey(arg0);
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> arg0) {
        if (this.putAllMapHandler != null && this.putAllMapHandler.getHandler() != null) {
            this.putAllMapHandler.getHandler().onPutAll(arg0);
        } else {
            super.putAll(arg0);
        }
    }

    @Override
    public V put(K arg0, V arg1) {
        return (this.putObjectObjectHandler != null && this.putObjectObjectHandler.getHandler() != null) ? this.putObjectObjectHandler.getHandler().onPut(arg0, arg1) : super.put(arg0, arg1);
    }

    @Override
    public V putIfAbsent(K arg0, V arg1) {
        return (this.putIfAbsentObjectObjectHandler != null && this.putIfAbsentObjectObjectHandler.getHandler() != null) ? this.putIfAbsentObjectObjectHandler.getHandler().onPutIfAbsent(arg0, arg1) : super.putIfAbsent(arg0, arg1);
    }

    @Override
    public V compute(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1) {
        return (this.computeObjectBiFunctionHandler != null && this.computeObjectBiFunctionHandler.getHandler() != null) ? this.computeObjectBiFunctionHandler.getHandler().onCompute(arg0, arg1) : super.compute(arg0, arg1);
    }

    @Override
    public V merge(K arg0, V arg1, java.util.function.BiFunction<? super V, ? super V, ? extends V> arg2) {
        return (this.mergeObjectObjectBiFunctionHandler != null && this.mergeObjectObjectBiFunctionHandler.getHandler() != null) ? this.mergeObjectObjectBiFunctionHandler.getHandler().onMerge(arg0, arg1, arg2) : super.merge(arg0, arg1, arg2);
    }

    @Override
    public V remove(java.lang.Object arg0) {
        return (this.removeObjectHandler != null && this.removeObjectHandler.getHandler() != null) ? this.removeObjectHandler.getHandler().onRemove(arg0) : super.remove(arg0);
    }
    @Override
    public java.util.Map.Entry<K, V> higherEntry(K arg0) {
        return (this.higherEntryObjectHandler != null && this.higherEntryObjectHandler.getHandler() != null) ? this.higherEntryObjectHandler.getHandler().onHigherEntry(arg0) : super.higherEntry(arg0);
    }
    @Override
    public K higherKey(K arg0) {
        return (this.higherKeyObjectHandler != null && this.higherKeyObjectHandler.getHandler() != null) ? this.higherKeyObjectHandler.getHandler().onHigherKey(arg0) : super.higherKey(arg0);
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
    public java.util.Set<K> keySet() {
        return (this.keySetHandler != null && this.keySetHandler.getHandler() != null) ? this.keySetHandler.getHandler().onKeySet() : super.keySet();
    }
    @Override
    public java.util.Map.Entry<K, V> lastEntry() {
        return (this.lastEntryHandler != null && this.lastEntryHandler.getHandler() != null) ? this.lastEntryHandler.getHandler().onLastEntry() : super.lastEntry();
    }

    @Override
    public java.lang.Object clone() {
        return (this.cloneHandler != null && this.cloneHandler.getHandler() != null) ? this.cloneHandler.getHandler().onClone() : super.clone();
    }
    @Override
    public java.util.Map.Entry<K, V> lowerEntry(K arg0) {
        return (this.lowerEntryObjectHandler != null && this.lowerEntryObjectHandler.getHandler() != null) ? this.lowerEntryObjectHandler.getHandler().onLowerEntry(arg0) : super.lowerEntry(arg0);
    }
    @Override
    public K lowerKey(K arg0) {
        return (this.lowerKeyObjectHandler != null && this.lowerKeyObjectHandler.getHandler() != null) ? this.lowerKeyObjectHandler.getHandler().onLowerKey(arg0) : super.lowerKey(arg0);
    }

    @Override
    public java.util.Map.Entry<K, V> pollFirstEntry() {
        return (this.pollFirstEntryHandler != null && this.pollFirstEntryHandler.getHandler() != null) ? this.pollFirstEntryHandler.getHandler().onPollFirstEntry() : super.pollFirstEntry();
    }
    @Override
    public java.util.NavigableSet<K> navigableKeySet() {
        return (this.navigableKeySetHandler != null && this.navigableKeySetHandler.getHandler() != null) ? this.navigableKeySetHandler.getHandler().onNavigableKeySet() : super.navigableKeySet();
    }

    @Override
    public java.util.Map.Entry<K, V> pollLastEntry() {
        return (this.pollLastEntryHandler != null && this.pollLastEntryHandler.getHandler() != null) ? this.pollLastEntryHandler.getHandler().onPollLastEntry() : super.pollLastEntry();
    }

    @Override
    public java.util.Map.Entry<K, V> ceilingEntry(K arg0) {
        return (this.ceilingEntryObjectHandler != null && this.ceilingEntryObjectHandler.getHandler() != null) ? this.ceilingEntryObjectHandler.getHandler().onCeilingEntry(arg0) : super.ceilingEntry(arg0);
    }

    @Override
    public K ceilingKey(K arg0) {
        return (this.ceilingKeyObjectHandler != null && this.ceilingKeyObjectHandler.getHandler() != null) ? this.ceilingKeyObjectHandler.getHandler().onCeilingKey(arg0) : super.ceilingKey(arg0);
    }

    @Override
    public java.util.NavigableSet<K> descendingKeySet() {
        return (this.descendingKeySetHandler != null && this.descendingKeySetHandler.getHandler() != null) ? this.descendingKeySetHandler.getHandler().onDescendingKeySet() : super.descendingKeySet();
    }

    @Override
    public java.util.Collection<V> values() {
        return (this.valuesHandler != null && this.valuesHandler.getHandler() != null) ? this.valuesHandler.getHandler().onValues() : super.values();
    }

    @Override
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return (this.entrySetHandler != null && this.entrySetHandler.getHandler() != null) ? this.entrySetHandler.getHandler().onEntrySet() : super.entrySet();
    }

    @Override
    public java.util.NavigableMap<K, V> descendingMap() {
        return (this.descendingMapHandler != null && this.descendingMapHandler.getHandler() != null) ? this.descendingMapHandler.getHandler().onDescendingMap() : super.descendingMap();
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
    public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> arg0) {
        if (this.replaceAllBiFunctionHandler != null && this.replaceAllBiFunctionHandler.getHandler() != null) {
            this.replaceAllBiFunctionHandler.getHandler().onReplaceAll(arg0);
        } else {
            super.replaceAll(arg0);
        }
    }

    @Override
    public java.util.NavigableMap<K, V> headMap(K arg0, boolean arg1) {
        return (this.headMapObjectBooleanHandler != null && this.headMapObjectBooleanHandler.getHandler() != null) ? this.headMapObjectBooleanHandler.getHandler().onHeadMap(arg0, arg1) : super.headMap(arg0, arg1);
    }

    @Override
    public java.util.SortedMap<K, V> subMap(K arg0, K arg1) {
        return (this.subMapObjectObjectHandler != null && this.subMapObjectObjectHandler.getHandler() != null) ? this.subMapObjectObjectHandler.getHandler().onSubMap(arg0, arg1) : super.subMap(arg0, arg1);
    }
    @Override
    public java.util.NavigableMap<K, V> subMap(K arg0, boolean arg1, K arg2, boolean arg3) {
        return (this.subMapObjectBooleanObjectBooleanHandler != null && this.subMapObjectBooleanObjectBooleanHandler.getHandler() != null) ? this.subMapObjectBooleanObjectBooleanHandler.getHandler().onSubMap(arg0, arg1, arg2, arg3) : super.subMap(arg0, arg1, arg2, arg3);
    }

    @Override
    public java.util.SortedMap<K, V> headMap(K arg0) {
        return (this.headMapObjectHandler != null && this.headMapObjectHandler.getHandler() != null) ? this.headMapObjectHandler.getHandler().onHeadMap(arg0) : super.headMap(arg0);
    }
    @Override
    public java.util.NavigableMap<K, V> tailMap(K arg0, boolean arg1) {
        return (this.tailMapObjectBooleanHandler != null && this.tailMapObjectBooleanHandler.getHandler() != null) ? this.tailMapObjectBooleanHandler.getHandler().onTailMap(arg0, arg1) : super.tailMap(arg0, arg1);
    }

    @Override
    public java.util.SortedMap<K, V> tailMap(K arg0) {
        return (this.tailMapObjectHandler != null && this.tailMapObjectHandler.getHandler() != null) ? this.tailMapObjectHandler.getHandler().onTailMap(arg0) : super.tailMap(arg0);
    }

    @Override
    public void forEach(java.util.function.BiConsumer<? super K, ? super V> arg0) {
        if (this.forEachBiConsumerHandler != null && this.forEachBiConsumerHandler.getHandler() != null) {
            this.forEachBiConsumerHandler.getHandler().onForEach(arg0);
        } else {
            super.forEach(arg0);
        }
    }
    @FunctionalInterface
    public interface CeilingEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onCeilingEntry(K arg0);
    }

    @FunctionalInterface
    public interface CeilingKeyObjectHandler<K> {
        K onCeilingKey(K arg0);
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
    public interface ComparatorHandler<K> {
        java.util.Comparator<? super K> onComparator();
    }

    @FunctionalInterface
    public interface ComputeIfAbsentObjectFunctionHandler<K, V> {
        V onComputeIfAbsent(K arg0, java.util.function.Function<? super K, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ComputeIfPresentObjectBiFunctionHandler<K, V> {
        V onComputeIfPresent(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ComputeObjectBiFunctionHandler<K, V> {
        V onCompute(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ContainsKeyObjectHandler {
        boolean onContainsKey(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface ContainsValueObjectHandler {
        boolean onContainsValue(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface DescendingKeySetHandler<K> {
        java.util.NavigableSet<K> onDescendingKeySet();
    }

    @FunctionalInterface
    public interface DescendingMapHandler<V, K> {
        java.util.NavigableMap<K, V> onDescendingMap();
    }

    @FunctionalInterface
    public interface EntrySetHandler<V, K> {
        java.util.Set<java.util.Map.Entry<K, V>> onEntrySet();
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface FirstEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onFirstEntry();
    }

    @FunctionalInterface
    public interface FirstKeyHandler<K> {
        K onFirstKey();
    }

    @FunctionalInterface
    public interface FloorEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onFloorEntry(K arg0);
    }

    @FunctionalInterface
    public interface FloorKeyObjectHandler<K> {
        K onFloorKey(K arg0);
    }

    @FunctionalInterface
    public interface ForEachBiConsumerHandler<V, K> {
        void onForEach(java.util.function.BiConsumer<? super K, ? super V> arg0);
    }

    @FunctionalInterface
    public interface GetObjectHandler<V> {
        V onGet(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface GetOrDefaultObjectObjectHandler<V> {
        V onGetOrDefault(java.lang.Object arg0, V arg1);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface HeadMapObjectBooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onHeadMap(K arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface HeadMapObjectHandler<K, V> {
        java.util.SortedMap<K, V> onHeadMap(K arg0);
    }

    @FunctionalInterface
    public interface HigherEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onHigherEntry(K arg0);
    }

    @FunctionalInterface
    public interface HigherKeyObjectHandler<K> {
        K onHigherKey(K arg0);
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface KeySetHandler<K> {
        java.util.Set<K> onKeySet();
    }

    @FunctionalInterface
    public interface LastEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onLastEntry();
    }

    @FunctionalInterface
    public interface LastKeyHandler<K> {
        K onLastKey();
    }

    @FunctionalInterface
    public interface LowerEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onLowerEntry(K arg0);
    }

    @FunctionalInterface
    public interface LowerKeyObjectHandler<K> {
        K onLowerKey(K arg0);
    }

    @FunctionalInterface
    public interface MergeObjectObjectBiFunctionHandler<K, V> {
        V onMerge(K arg0, V arg1, java.util.function.BiFunction<? super V, ? super V, ? extends V> arg2);
    }

    @FunctionalInterface
    public interface NavigableKeySetHandler<K> {
        java.util.NavigableSet<K> onNavigableKeySet();
    }

    @FunctionalInterface
    public interface PollFirstEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onPollFirstEntry();
    }

    @FunctionalInterface
    public interface PollLastEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onPollLastEntry();
    }

    @FunctionalInterface
    public interface PutAllMapHandler<V, K> {
        void onPutAll(java.util.Map<? extends K, ? extends V> arg0);
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
        V onRemove(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectObjectHandler {
        boolean onRemove(java.lang.Object arg0, java.lang.Object arg1);
    }

    @FunctionalInterface
    public interface ReplaceAllBiFunctionHandler<V, K> {
        void onReplaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> arg0);
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
    public interface SubMapObjectBooleanObjectBooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onSubMap(K arg0, boolean arg1, K arg2, boolean arg3);
    }

    @FunctionalInterface
    public interface SubMapObjectObjectHandler<K, V> {
        java.util.SortedMap<K, V> onSubMap(K arg0, K arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectBooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onTailMap(K arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectHandler<K, V> {
        java.util.SortedMap<K, V> onTailMap(K arg0);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        java.lang.String onToString();
    }

    @FunctionalInterface
    public interface ValuesHandler<V> {
        java.util.Collection<V> onValues();
    }

}
