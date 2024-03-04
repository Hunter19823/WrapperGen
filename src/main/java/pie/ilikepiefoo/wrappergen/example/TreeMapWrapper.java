package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;

import java.util.TreeMap;
public class TreeMapWrapper<K, V> extends TreeMap<K, V> {
    public final MethodOverrideHandler<CeilingEntryObjectHandler<K, V>> ceilingEntryObjectHandler;
    public final MethodOverrideHandler<CeilingKeyObjectHandler<K>> ceilingKeyObjectHandler;
    public final MethodOverrideHandler<ClearHandler> clearHandler;
    public final MethodOverrideHandler<CloneHandler> cloneHandler;
    public final MethodOverrideHandler<ComparatorHandler<K>> comparatorHandler;
    public final MethodOverrideHandler<ComputeIfAbsentObjectFunctionHandler<K, V>> computeIfAbsentObjectFunctionHandler;
    public final MethodOverrideHandler<ComputeIfPresentObjectBiFunctionHandler<K, V>> computeIfPresentObjectBiFunctionHandler;
    public final MethodOverrideHandler<ComputeObjectBiFunctionHandler<K, V>> computeObjectBiFunctionHandler;
    public final MethodOverrideHandler<ContainsKeyObjectHandler> containsKeyObjectHandler;
    public final MethodOverrideHandler<ContainsValueObjectHandler> containsValueObjectHandler;
    public final MethodOverrideHandler<DescendingKeySetHandler<K>> descendingKeySetHandler;
    public final MethodOverrideHandler<DescendingMapHandler<V, K>> descendingMapHandler;
    public final MethodOverrideHandler<EntrySetHandler<V, K>> entrySetHandler;
    public final MethodOverrideHandler<EqualsObjectHandler> equalsObjectHandler;
    public final MethodOverrideHandler<FirstEntryHandler<V, K>> firstEntryHandler;
    public final MethodOverrideHandler<FirstKeyHandler<K>> firstKeyHandler;
    public final MethodOverrideHandler<FloorEntryObjectHandler<K, V>> floorEntryObjectHandler;
    public final MethodOverrideHandler<FloorKeyObjectHandler<K>> floorKeyObjectHandler;
    public final MethodOverrideHandler<ForEachBiConsumerHandler<V, K>> forEachBiConsumerHandler;
    public final MethodOverrideHandler<GetObjectHandler<V>> getObjectHandler;
    public final MethodOverrideHandler<GetOrDefaultObjectObjectHandler<V>> getOrDefaultObjectObjectHandler;
    public final MethodOverrideHandler<HashCodeHandler> hashCodeHandler;
    public final MethodOverrideHandler<HeadMapObjectHandler<K, V>> headMapObjectHandler;
    public final MethodOverrideHandler<HeadMapObjectbooleanHandler<K, V>> headMapObjectbooleanHandler;
    public final MethodOverrideHandler<HigherEntryObjectHandler<K, V>> higherEntryObjectHandler;
    public final MethodOverrideHandler<HigherKeyObjectHandler<K>> higherKeyObjectHandler;
    public final MethodOverrideHandler<IsEmptyHandler> isEmptyHandler;
    public final MethodOverrideHandler<KeySetHandler<K>> keySetHandler;
    public final MethodOverrideHandler<LastEntryHandler<V, K>> lastEntryHandler;
    public final MethodOverrideHandler<LastKeyHandler<K>> lastKeyHandler;
    public final MethodOverrideHandler<LowerEntryObjectHandler<K, V>> lowerEntryObjectHandler;
    public final MethodOverrideHandler<LowerKeyObjectHandler<K>> lowerKeyObjectHandler;
    public final MethodOverrideHandler<MergeObjectObjectBiFunctionHandler<K, V>> mergeObjectObjectBiFunctionHandler;
    public final MethodOverrideHandler<NavigableKeySetHandler<K>> navigableKeySetHandler;
    public final MethodOverrideHandler<PollFirstEntryHandler<V, K>> pollFirstEntryHandler;
    public final MethodOverrideHandler<PollLastEntryHandler<V, K>> pollLastEntryHandler;
    public final MethodOverrideHandler<PutAllMapHandler<V, K>> putAllMapHandler;
    public final MethodOverrideHandler<PutIfAbsentObjectObjectHandler<K, V>> putIfAbsentObjectObjectHandler;
    public final MethodOverrideHandler<PutObjectObjectHandler<K, V>> putObjectObjectHandler;
    public final MethodOverrideHandler<RemoveObjectHandler<V>> removeObjectHandler;
    public final MethodOverrideHandler<RemoveObjectObjectHandler> removeObjectObjectHandler;
    public final MethodOverrideHandler<ReplaceAllBiFunctionHandler<V, K>> replaceAllBiFunctionHandler;
    public final MethodOverrideHandler<ReplaceObjectObjectHandler<K, V>> replaceObjectObjectHandler;
    public final MethodOverrideHandler<ReplaceObjectObjectObjectHandler<K, V>> replaceObjectObjectObjectHandler;
    public final MethodOverrideHandler<SizeHandler> sizeHandler;
    public final MethodOverrideHandler<SubMapObjectObjectHandler<K, V>> subMapObjectObjectHandler;
    public final MethodOverrideHandler<SubMapObjectbooleanObjectbooleanHandler<K, V>> subMapObjectbooleanObjectbooleanHandler;
    public final MethodOverrideHandler<TailMapObjectHandler<K, V>> tailMapObjectHandler;
    public final MethodOverrideHandler<TailMapObjectbooleanHandler<K, V>> tailMapObjectbooleanHandler;
    public final MethodOverrideHandler<ToStringHandler> toStringHandler;
    public final MethodOverrideHandler<ValuesHandler<V>> valuesHandler;
    public TreeMapWrapper(java.util.SortedMap<K, ? extends V> arg0) {
        super(arg0);
        this.removeObjectHandler = new MethodOverrideHandler<>(super::remove);
        this.getObjectHandler = new MethodOverrideHandler<>(super::get);
        this.putObjectObjectHandler = new MethodOverrideHandler<>(super::put);
        this.valuesHandler = new MethodOverrideHandler<>(super::values);
        this.cloneHandler = new MethodOverrideHandler<>(super::clone);
        this.clearHandler = new MethodOverrideHandler<>(super::clear);
        this.replaceObjectObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceAllBiFunctionHandler = new MethodOverrideHandler<>(super::replaceAll);
        this.sizeHandler = new MethodOverrideHandler<>(super::size);
        this.mergeObjectObjectBiFunctionHandler = new MethodOverrideHandler<>(super::merge);
        this.entrySetHandler = new MethodOverrideHandler<>(super::entrySet);
        this.putAllMapHandler = new MethodOverrideHandler<>(super::putAll);
        this.putIfAbsentObjectObjectHandler = new MethodOverrideHandler<>(super::putIfAbsent);
        this.computeObjectBiFunctionHandler = new MethodOverrideHandler<>(super::compute);
        this.forEachBiConsumerHandler = new MethodOverrideHandler<>(super::forEach);
        this.containsKeyObjectHandler = new MethodOverrideHandler<>(super::containsKey);
        this.computeIfAbsentObjectFunctionHandler = new MethodOverrideHandler<>(super::computeIfAbsent);
        this.keySetHandler = new MethodOverrideHandler<>(super::keySet);
        this.containsValueObjectHandler = new MethodOverrideHandler<>(super::containsValue);
        this.computeIfPresentObjectBiFunctionHandler = new MethodOverrideHandler<>(super::computeIfPresent);
        this.comparatorHandler = new MethodOverrideHandler<>(super::comparator);
        this.firstKeyHandler = new MethodOverrideHandler<>(super::firstKey);
        this.lowerEntryObjectHandler = new MethodOverrideHandler<>(super::lowerEntry);
        this.lowerKeyObjectHandler = new MethodOverrideHandler<>(super::lowerKey);
        this.floorEntryObjectHandler = new MethodOverrideHandler<>(super::floorEntry);
        this.floorKeyObjectHandler = new MethodOverrideHandler<>(super::floorKey);
        this.ceilingEntryObjectHandler = new MethodOverrideHandler<>(super::ceilingEntry);
        this.ceilingKeyObjectHandler = new MethodOverrideHandler<>(super::ceilingKey);
        this.higherEntryObjectHandler = new MethodOverrideHandler<>(super::higherEntry);
        this.higherKeyObjectHandler = new MethodOverrideHandler<>(super::higherKey);
        this.firstEntryHandler = new MethodOverrideHandler<>(super::firstEntry);
        this.lastEntryHandler = new MethodOverrideHandler<>(super::lastEntry);
        this.pollFirstEntryHandler = new MethodOverrideHandler<>(super::pollFirstEntry);
        this.pollLastEntryHandler = new MethodOverrideHandler<>(super::pollLastEntry);
        this.descendingMapHandler = new MethodOverrideHandler<>(super::descendingMap);
        this.navigableKeySetHandler = new MethodOverrideHandler<>(super::navigableKeySet);
        this.descendingKeySetHandler = new MethodOverrideHandler<>(super::descendingKeySet);
        this.subMapObjectObjectHandler = new MethodOverrideHandler<>(super::subMap);
        this.subMapObjectbooleanObjectbooleanHandler = new MethodOverrideHandler<>(super::subMap);
        this.headMapObjectbooleanHandler = new MethodOverrideHandler<>(super::headMap);
        this.headMapObjectHandler = new MethodOverrideHandler<>(super::headMap);
        this.tailMapObjectHandler = new MethodOverrideHandler<>(super::tailMap);
        this.tailMapObjectbooleanHandler = new MethodOverrideHandler<>(super::tailMap);
        this.lastKeyHandler = new MethodOverrideHandler<>(super::lastKey);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
        this.isEmptyHandler = new MethodOverrideHandler<>(super::isEmpty);
        this.removeObjectObjectHandler = new MethodOverrideHandler<>(this::remove);
        this.getOrDefaultObjectObjectHandler = new MethodOverrideHandler<>(this::getOrDefault);
    }

    public TreeMapWrapper(java.util.Map<? extends K, ? extends V> arg0) {
        super(arg0);
        this.removeObjectHandler = new MethodOverrideHandler<>(super::remove);
        this.getObjectHandler = new MethodOverrideHandler<>(super::get);
        this.putObjectObjectHandler = new MethodOverrideHandler<>(super::put);
        this.valuesHandler = new MethodOverrideHandler<>(super::values);
        this.cloneHandler = new MethodOverrideHandler<>(super::clone);
        this.clearHandler = new MethodOverrideHandler<>(super::clear);
        this.replaceObjectObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceAllBiFunctionHandler = new MethodOverrideHandler<>(super::replaceAll);
        this.sizeHandler = new MethodOverrideHandler<>(super::size);
        this.mergeObjectObjectBiFunctionHandler = new MethodOverrideHandler<>(super::merge);
        this.entrySetHandler = new MethodOverrideHandler<>(super::entrySet);
        this.putAllMapHandler = new MethodOverrideHandler<>(super::putAll);
        this.putIfAbsentObjectObjectHandler = new MethodOverrideHandler<>(super::putIfAbsent);
        this.computeObjectBiFunctionHandler = new MethodOverrideHandler<>(super::compute);
        this.forEachBiConsumerHandler = new MethodOverrideHandler<>(super::forEach);
        this.containsKeyObjectHandler = new MethodOverrideHandler<>(super::containsKey);
        this.computeIfAbsentObjectFunctionHandler = new MethodOverrideHandler<>(super::computeIfAbsent);
        this.keySetHandler = new MethodOverrideHandler<>(super::keySet);
        this.containsValueObjectHandler = new MethodOverrideHandler<>(super::containsValue);
        this.computeIfPresentObjectBiFunctionHandler = new MethodOverrideHandler<>(super::computeIfPresent);
        this.comparatorHandler = new MethodOverrideHandler<>(super::comparator);
        this.firstKeyHandler = new MethodOverrideHandler<>(super::firstKey);
        this.lowerEntryObjectHandler = new MethodOverrideHandler<>(super::lowerEntry);
        this.lowerKeyObjectHandler = new MethodOverrideHandler<>(super::lowerKey);
        this.floorEntryObjectHandler = new MethodOverrideHandler<>(super::floorEntry);
        this.floorKeyObjectHandler = new MethodOverrideHandler<>(super::floorKey);
        this.ceilingEntryObjectHandler = new MethodOverrideHandler<>(super::ceilingEntry);
        this.ceilingKeyObjectHandler = new MethodOverrideHandler<>(super::ceilingKey);
        this.higherEntryObjectHandler = new MethodOverrideHandler<>(super::higherEntry);
        this.higherKeyObjectHandler = new MethodOverrideHandler<>(super::higherKey);
        this.firstEntryHandler = new MethodOverrideHandler<>(super::firstEntry);
        this.lastEntryHandler = new MethodOverrideHandler<>(super::lastEntry);
        this.pollFirstEntryHandler = new MethodOverrideHandler<>(super::pollFirstEntry);
        this.pollLastEntryHandler = new MethodOverrideHandler<>(super::pollLastEntry);
        this.descendingMapHandler = new MethodOverrideHandler<>(super::descendingMap);
        this.navigableKeySetHandler = new MethodOverrideHandler<>(super::navigableKeySet);
        this.descendingKeySetHandler = new MethodOverrideHandler<>(super::descendingKeySet);
        this.subMapObjectObjectHandler = new MethodOverrideHandler<>(super::subMap);
        this.subMapObjectbooleanObjectbooleanHandler = new MethodOverrideHandler<>(super::subMap);
        this.headMapObjectbooleanHandler = new MethodOverrideHandler<>(super::headMap);
        this.headMapObjectHandler = new MethodOverrideHandler<>(super::headMap);
        this.tailMapObjectHandler = new MethodOverrideHandler<>(super::tailMap);
        this.tailMapObjectbooleanHandler = new MethodOverrideHandler<>(super::tailMap);
        this.lastKeyHandler = new MethodOverrideHandler<>(super::lastKey);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
        this.isEmptyHandler = new MethodOverrideHandler<>(super::isEmpty);
        this.removeObjectObjectHandler = new MethodOverrideHandler<>(this::remove);
        this.getOrDefaultObjectObjectHandler = new MethodOverrideHandler<>(this::getOrDefault);
    }

    public TreeMapWrapper(java.util.Comparator<? super K> arg0) {
        super(arg0);
        this.removeObjectHandler = new MethodOverrideHandler<>(super::remove);
        this.getObjectHandler = new MethodOverrideHandler<>(super::get);
        this.putObjectObjectHandler = new MethodOverrideHandler<>(super::put);
        this.valuesHandler = new MethodOverrideHandler<>(super::values);
        this.cloneHandler = new MethodOverrideHandler<>(super::clone);
        this.clearHandler = new MethodOverrideHandler<>(super::clear);
        this.replaceObjectObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceAllBiFunctionHandler = new MethodOverrideHandler<>(super::replaceAll);
        this.sizeHandler = new MethodOverrideHandler<>(super::size);
        this.mergeObjectObjectBiFunctionHandler = new MethodOverrideHandler<>(super::merge);
        this.entrySetHandler = new MethodOverrideHandler<>(super::entrySet);
        this.putAllMapHandler = new MethodOverrideHandler<>(super::putAll);
        this.putIfAbsentObjectObjectHandler = new MethodOverrideHandler<>(super::putIfAbsent);
        this.computeObjectBiFunctionHandler = new MethodOverrideHandler<>(super::compute);
        this.forEachBiConsumerHandler = new MethodOverrideHandler<>(super::forEach);
        this.containsKeyObjectHandler = new MethodOverrideHandler<>(super::containsKey);
        this.computeIfAbsentObjectFunctionHandler = new MethodOverrideHandler<>(super::computeIfAbsent);
        this.keySetHandler = new MethodOverrideHandler<>(super::keySet);
        this.containsValueObjectHandler = new MethodOverrideHandler<>(super::containsValue);
        this.computeIfPresentObjectBiFunctionHandler = new MethodOverrideHandler<>(super::computeIfPresent);
        this.comparatorHandler = new MethodOverrideHandler<>(super::comparator);
        this.firstKeyHandler = new MethodOverrideHandler<>(super::firstKey);
        this.lowerEntryObjectHandler = new MethodOverrideHandler<>(super::lowerEntry);
        this.lowerKeyObjectHandler = new MethodOverrideHandler<>(super::lowerKey);
        this.floorEntryObjectHandler = new MethodOverrideHandler<>(super::floorEntry);
        this.floorKeyObjectHandler = new MethodOverrideHandler<>(super::floorKey);
        this.ceilingEntryObjectHandler = new MethodOverrideHandler<>(super::ceilingEntry);
        this.ceilingKeyObjectHandler = new MethodOverrideHandler<>(super::ceilingKey);
        this.higherEntryObjectHandler = new MethodOverrideHandler<>(super::higherEntry);
        this.higherKeyObjectHandler = new MethodOverrideHandler<>(super::higherKey);
        this.firstEntryHandler = new MethodOverrideHandler<>(super::firstEntry);
        this.lastEntryHandler = new MethodOverrideHandler<>(super::lastEntry);
        this.pollFirstEntryHandler = new MethodOverrideHandler<>(super::pollFirstEntry);
        this.pollLastEntryHandler = new MethodOverrideHandler<>(super::pollLastEntry);
        this.descendingMapHandler = new MethodOverrideHandler<>(super::descendingMap);
        this.navigableKeySetHandler = new MethodOverrideHandler<>(super::navigableKeySet);
        this.descendingKeySetHandler = new MethodOverrideHandler<>(super::descendingKeySet);
        this.subMapObjectObjectHandler = new MethodOverrideHandler<>(super::subMap);
        this.subMapObjectbooleanObjectbooleanHandler = new MethodOverrideHandler<>(super::subMap);
        this.headMapObjectbooleanHandler = new MethodOverrideHandler<>(super::headMap);
        this.headMapObjectHandler = new MethodOverrideHandler<>(super::headMap);
        this.tailMapObjectHandler = new MethodOverrideHandler<>(super::tailMap);
        this.tailMapObjectbooleanHandler = new MethodOverrideHandler<>(super::tailMap);
        this.lastKeyHandler = new MethodOverrideHandler<>(super::lastKey);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
        this.isEmptyHandler = new MethodOverrideHandler<>(super::isEmpty);
        this.removeObjectObjectHandler = new MethodOverrideHandler<>(this::remove);
        this.getOrDefaultObjectObjectHandler = new MethodOverrideHandler<>(this::getOrDefault);
    }

    public TreeMapWrapper() {
        super();
        this.removeObjectHandler = new MethodOverrideHandler<>(super::remove);
        this.getObjectHandler = new MethodOverrideHandler<>(super::get);
        this.putObjectObjectHandler = new MethodOverrideHandler<>(super::put);
        this.valuesHandler = new MethodOverrideHandler<>(super::values);
        this.cloneHandler = new MethodOverrideHandler<>(super::clone);
        this.clearHandler = new MethodOverrideHandler<>(super::clear);
        this.replaceObjectObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceObjectObjectHandler = new MethodOverrideHandler<>(super::replace);
        this.replaceAllBiFunctionHandler = new MethodOverrideHandler<>(super::replaceAll);
        this.sizeHandler = new MethodOverrideHandler<>(super::size);
        this.mergeObjectObjectBiFunctionHandler = new MethodOverrideHandler<>(super::merge);
        this.entrySetHandler = new MethodOverrideHandler<>(super::entrySet);
        this.putAllMapHandler = new MethodOverrideHandler<>(super::putAll);
        this.putIfAbsentObjectObjectHandler = new MethodOverrideHandler<>(super::putIfAbsent);
        this.computeObjectBiFunctionHandler = new MethodOverrideHandler<>(super::compute);
        this.forEachBiConsumerHandler = new MethodOverrideHandler<>(super::forEach);
        this.containsKeyObjectHandler = new MethodOverrideHandler<>(super::containsKey);
        this.computeIfAbsentObjectFunctionHandler = new MethodOverrideHandler<>(super::computeIfAbsent);
        this.keySetHandler = new MethodOverrideHandler<>(super::keySet);
        this.containsValueObjectHandler = new MethodOverrideHandler<>(super::containsValue);
        this.computeIfPresentObjectBiFunctionHandler = new MethodOverrideHandler<>(super::computeIfPresent);
        this.comparatorHandler = new MethodOverrideHandler<>(super::comparator);
        this.firstKeyHandler = new MethodOverrideHandler<>(super::firstKey);
        this.lowerEntryObjectHandler = new MethodOverrideHandler<>(super::lowerEntry);
        this.lowerKeyObjectHandler = new MethodOverrideHandler<>(super::lowerKey);
        this.floorEntryObjectHandler = new MethodOverrideHandler<>(super::floorEntry);
        this.floorKeyObjectHandler = new MethodOverrideHandler<>(super::floorKey);
        this.ceilingEntryObjectHandler = new MethodOverrideHandler<>(super::ceilingEntry);
        this.ceilingKeyObjectHandler = new MethodOverrideHandler<>(super::ceilingKey);
        this.higherEntryObjectHandler = new MethodOverrideHandler<>(super::higherEntry);
        this.higherKeyObjectHandler = new MethodOverrideHandler<>(super::higherKey);
        this.firstEntryHandler = new MethodOverrideHandler<>(super::firstEntry);
        this.lastEntryHandler = new MethodOverrideHandler<>(super::lastEntry);
        this.pollFirstEntryHandler = new MethodOverrideHandler<>(super::pollFirstEntry);
        this.pollLastEntryHandler = new MethodOverrideHandler<>(super::pollLastEntry);
        this.descendingMapHandler = new MethodOverrideHandler<>(super::descendingMap);
        this.navigableKeySetHandler = new MethodOverrideHandler<>(super::navigableKeySet);
        this.descendingKeySetHandler = new MethodOverrideHandler<>(super::descendingKeySet);
        this.subMapObjectObjectHandler = new MethodOverrideHandler<>(super::subMap);
        this.subMapObjectbooleanObjectbooleanHandler = new MethodOverrideHandler<>(super::subMap);
        this.headMapObjectbooleanHandler = new MethodOverrideHandler<>(super::headMap);
        this.headMapObjectHandler = new MethodOverrideHandler<>(super::headMap);
        this.tailMapObjectHandler = new MethodOverrideHandler<>(super::tailMap);
        this.tailMapObjectbooleanHandler = new MethodOverrideHandler<>(super::tailMap);
        this.lastKeyHandler = new MethodOverrideHandler<>(super::lastKey);
        this.equalsObjectHandler = new MethodOverrideHandler<>(super::equals);
        this.toStringHandler = new MethodOverrideHandler<>(super::toString);
        this.hashCodeHandler = new MethodOverrideHandler<>(super::hashCode);
        this.isEmptyHandler = new MethodOverrideHandler<>(super::isEmpty);
        this.removeObjectObjectHandler = new MethodOverrideHandler<>(this::remove);
        this.getOrDefaultObjectObjectHandler = new MethodOverrideHandler<>(this::getOrDefault);
    }

    @Override
    public V getOrDefault(java.lang.Object arg0, V arg1) {
        return this.getOrDefaultObjectObjectHandler.getHandler().onGetOrDefault(arg0, arg1);
    }

    @Override
    public boolean remove(java.lang.Object arg0, java.lang.Object arg1) {
        return this.removeObjectObjectHandler.getHandler().onRemove(arg0, arg1);
    }

    @Override
    public boolean isEmpty() {
        return this.isEmptyHandler.getHandler().onIsEmpty();
    }

    @Override
    public boolean equals(java.lang.Object arg0) {
        return this.equalsObjectHandler.getHandler().onEquals(arg0);
    }
    @Override
    public java.util.Comparator<? super K> comparator() {
        return this.comparatorHandler.getHandler().onComparator();
    }

    @Override
    public int hashCode() {
        return this.hashCodeHandler.getHandler().onHashCode();
    }
    @Override
    public V computeIfAbsent(K arg0, java.util.function.Function<? super K, ? extends V> arg1) {
        return this.computeIfAbsentObjectFunctionHandler.getHandler().onComputeIfAbsent(arg0, arg1);
    }
    @Override
    public V computeIfPresent(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1) {
        return this.computeIfPresentObjectBiFunctionHandler.getHandler().onComputeIfPresent(arg0, arg1);
    }
    @Override
    public boolean containsKey(java.lang.Object arg0) {
        return this.containsKeyObjectHandler.getHandler().onContainsKey(arg0);
    }
    @Override
    public boolean containsValue(java.lang.Object arg0) {
        return this.containsValueObjectHandler.getHandler().onContainsValue(arg0);
    }

    @Override
    public int size() {
        return this.sizeHandler.getHandler().onSize();
    }

    @Override
    public V get(java.lang.Object arg0) {
        return this.getObjectHandler.getHandler().onGet(arg0);
    }

    @Override
    public K firstKey() {
        return this.firstKeyHandler.getHandler().onFirstKey();
    }

    @Override
    public K lastKey() {
        return this.lastKeyHandler.getHandler().onLastKey();
    }
    @Override
    public java.util.Map.Entry<K, V> firstEntry() {
        return this.firstEntryHandler.getHandler().onFirstEntry();
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> arg0) {
        this.putAllMapHandler.getHandler().onPutAll(arg0);
    }
    @Override
    public java.util.Map.Entry<K, V> floorEntry(K arg0) {
        return this.floorEntryObjectHandler.getHandler().onFloorEntry(arg0);
    }
    @Override
    public K floorKey(K arg0) {
        return this.floorKeyObjectHandler.getHandler().onFloorKey(arg0);
    }

    @Override
    public V put(K arg0, V arg1) {
        return this.putObjectObjectHandler.getHandler().onPut(arg0, arg1);
    }

    @Override
    public V putIfAbsent(K arg0, V arg1) {
        return this.putIfAbsentObjectObjectHandler.getHandler().onPutIfAbsent(arg0, arg1);
    }

    @Override
    public V compute(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1) {
        return this.computeObjectBiFunctionHandler.getHandler().onCompute(arg0, arg1);
    }

    @Override
    public V merge(K arg0, V arg1, java.util.function.BiFunction<? super V, ? super V, ? extends V> arg2) {
        return this.mergeObjectObjectBiFunctionHandler.getHandler().onMerge(arg0, arg1, arg2);
    }

    @Override
    public V remove(java.lang.Object arg0) {
        return this.removeObjectHandler.getHandler().onRemove(arg0);
    }

    @Override
    public void clear() {
        this.clearHandler.getHandler().onClear();
    }
    @Override
    public java.util.Map.Entry<K, V> higherEntry(K arg0) {
        return this.higherEntryObjectHandler.getHandler().onHigherEntry(arg0);
    }
    @Override
    public K higherKey(K arg0) {
        return this.higherKeyObjectHandler.getHandler().onHigherKey(arg0);
    }

    @Override
    public java.lang.Object clone() {
        return this.cloneHandler.getHandler().onClone();
    }
    @Override
    public java.util.Set<K> keySet() {
        return this.keySetHandler.getHandler().onKeySet();
    }
    @Override
    public java.util.Map.Entry<K, V> lastEntry() {
        return this.lastEntryHandler.getHandler().onLastEntry();
    }

    @Override
    public java.util.Map.Entry<K, V> pollFirstEntry() {
        return this.pollFirstEntryHandler.getHandler().onPollFirstEntry();
    }
    @Override
    public java.util.Map.Entry<K, V> lowerEntry(K arg0) {
        return this.lowerEntryObjectHandler.getHandler().onLowerEntry(arg0);
    }
    @Override
    public K lowerKey(K arg0) {
        return this.lowerKeyObjectHandler.getHandler().onLowerKey(arg0);
    }

    @Override
    public java.util.Map.Entry<K, V> pollLastEntry() {
        return this.pollLastEntryHandler.getHandler().onPollLastEntry();
    }
    @Override
    public java.util.NavigableSet<K> navigableKeySet() {
        return this.navigableKeySetHandler.getHandler().onNavigableKeySet();
    }

    @Override
    public java.util.Map.Entry<K, V> ceilingEntry(K arg0) {
        return this.ceilingEntryObjectHandler.getHandler().onCeilingEntry(arg0);
    }

    @Override
    public K ceilingKey(K arg0) {
        return this.ceilingKeyObjectHandler.getHandler().onCeilingKey(arg0);
    }

    @Override
    public java.util.NavigableSet<K> descendingKeySet() {
        return this.descendingKeySetHandler.getHandler().onDescendingKeySet();
    }

    @Override
    public java.util.Collection<V> values() {
        return this.valuesHandler.getHandler().onValues();
    }

    @Override
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return this.entrySetHandler.getHandler().onEntrySet();
    }

    @Override
    public java.util.NavigableMap<K, V> descendingMap() {
        return this.descendingMapHandler.getHandler().onDescendingMap();
    }

    @Override
    public java.util.NavigableMap<K, V> subMap(K arg0, boolean arg1, K arg2, boolean arg3) {
        return this.subMapObjectbooleanObjectbooleanHandler.getHandler().onSubMap(arg0, arg1, arg2, arg3);
    }
    @Override
    public boolean replace(K arg0, V arg1, V arg2) {
        return this.replaceObjectObjectObjectHandler.getHandler().onReplace(arg0, arg1, arg2);
    }
    @Override
    public V replace(K arg0, V arg1) {
        return this.replaceObjectObjectHandler.getHandler().onReplace(arg0, arg1);
    }
    @Override
    public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> arg0) {
        this.replaceAllBiFunctionHandler.getHandler().onReplaceAll(arg0);
    }

    @Override
    public java.util.NavigableMap<K, V> headMap(K arg0, boolean arg1) {
        return this.headMapObjectbooleanHandler.getHandler().onHeadMap(arg0, arg1);
    }
    @Override
    public java.util.SortedMap<K, V> subMap(K arg0, K arg1) {
        return this.subMapObjectObjectHandler.getHandler().onSubMap(arg0, arg1);
    }

    @Override
    public java.util.NavigableMap<K, V> tailMap(K arg0, boolean arg1) {
        return this.tailMapObjectbooleanHandler.getHandler().onTailMap(arg0, arg1);
    }
    @Override
    public java.util.SortedMap<K, V> tailMap(K arg0) {
        return this.tailMapObjectHandler.getHandler().onTailMap(arg0);
    }

    @Override
    public java.util.SortedMap<K, V> headMap(K arg0) {
        return this.headMapObjectHandler.getHandler().onHeadMap(arg0);
    }
    @Override
    public java.lang.String toString() {
        return this.toStringHandler.getHandler().onToString();
    }

    @Override
    public void forEach(java.util.function.BiConsumer<? super K, ? super V> arg0) {
        this.forEachBiConsumerHandler.getHandler().onForEach(arg0);
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
    public interface HeadMapObjectHandler<K, V> {
        java.util.SortedMap<K, V> onHeadMap(K arg0);
    }

    @FunctionalInterface
    public interface HeadMapObjectbooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onHeadMap(K arg0, boolean arg1);
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
    public interface SubMapObjectObjectHandler<K, V> {
        java.util.SortedMap<K, V> onSubMap(K arg0, K arg1);
    }

    @FunctionalInterface
    public interface SubMapObjectbooleanObjectbooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onSubMap(K arg0, boolean arg1, K arg2, boolean arg3);
    }

    @FunctionalInterface
    public interface TailMapObjectHandler<K, V> {
        java.util.SortedMap<K, V> onTailMap(K arg0);
    }

    @FunctionalInterface
    public interface TailMapObjectbooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onTailMap(K arg0, boolean arg1);
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
