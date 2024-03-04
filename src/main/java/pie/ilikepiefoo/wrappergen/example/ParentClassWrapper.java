package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodOverrideHandler;

public class ParentClassWrapper extends ParentClass {
    public final MethodOverrideHandler<CeilingEntryObjectHandler> ceilingEntryObjectHandler;
    public final MethodOverrideHandler<CeilingKeyObjectHandler> ceilingKeyObjectHandler;
    public final MethodOverrideHandler<ClearHandler> clearHandler;
    public final MethodOverrideHandler<CloneHandler> cloneHandler;
    public final MethodOverrideHandler<ComparatorHandler> comparatorHandler;
    public final MethodOverrideHandler<ComputeIfAbsentObjectFunctionHandler> computeIfAbsentObjectFunctionHandler;
    public final MethodOverrideHandler<ComputeIfPresentObjectBiFunctionHandler> computeIfPresentObjectBiFunctionHandler;
    public final MethodOverrideHandler<ComputeObjectBiFunctionHandler> computeObjectBiFunctionHandler;
    public final MethodOverrideHandler<ContainsKeyObjectHandler> containsKeyObjectHandler;
    public final MethodOverrideHandler<ContainsValueObjectHandler> containsValueObjectHandler;
    public final MethodOverrideHandler<DescendingKeySetHandler> descendingKeySetHandler;
    public final MethodOverrideHandler<DescendingMapHandler> descendingMapHandler;
    public final MethodOverrideHandler<EntrySetHandler> entrySetHandler;
    public final MethodOverrideHandler<EqualsObjectHandler> equalsObjectHandler;
    public final MethodOverrideHandler<FirstEntryHandler> firstEntryHandler;
    public final MethodOverrideHandler<FirstKeyHandler> firstKeyHandler;
    public final MethodOverrideHandler<FloorEntryObjectHandler> floorEntryObjectHandler;
    public final MethodOverrideHandler<FloorKeyObjectHandler> floorKeyObjectHandler;
    public final MethodOverrideHandler<ForEachBiConsumerHandler> forEachBiConsumerHandler;
    public final MethodOverrideHandler<GetObjectHandler> getObjectHandler;
    public final MethodOverrideHandler<GetOrDefaultObjectObjectHandler> getOrDefaultObjectObjectHandler;
    public final MethodOverrideHandler<HashCodeHandler> hashCodeHandler;
    public final MethodOverrideHandler<HeadMapObjectHandler> headMapObjectHandler;
    public final MethodOverrideHandler<HeadMapObjectbooleanHandler> headMapObjectbooleanHandler;
    public final MethodOverrideHandler<HigherEntryObjectHandler> higherEntryObjectHandler;
    public final MethodOverrideHandler<HigherKeyObjectHandler> higherKeyObjectHandler;
    public final MethodOverrideHandler<IsEmptyHandler> isEmptyHandler;
    public final MethodOverrideHandler<KeySetHandler> keySetHandler;
    public final MethodOverrideHandler<LastEntryHandler> lastEntryHandler;
    public final MethodOverrideHandler<LastKeyHandler> lastKeyHandler;
    public final MethodOverrideHandler<LowerEntryObjectHandler> lowerEntryObjectHandler;
    public final MethodOverrideHandler<LowerKeyObjectHandler> lowerKeyObjectHandler;
    public final MethodOverrideHandler<MergeObjectObjectBiFunctionHandler> mergeObjectObjectBiFunctionHandler;
    public final MethodOverrideHandler<NavigableKeySetHandler> navigableKeySetHandler;
    public final MethodOverrideHandler<PollFirstEntryHandler> pollFirstEntryHandler;
    public final MethodOverrideHandler<PollLastEntryHandler> pollLastEntryHandler;
    public final MethodOverrideHandler<PutAllMapHandler> putAllMapHandler;
    public final MethodOverrideHandler<PutIfAbsentObjectObjectHandler> putIfAbsentObjectObjectHandler;
    public final MethodOverrideHandler<PutObjectObjectHandler> putObjectObjectHandler;
    public final MethodOverrideHandler<RemoveObjectHandler> removeObjectHandler;
    public final MethodOverrideHandler<RemoveObjectObjectHandler> removeObjectObjectHandler;
    public final MethodOverrideHandler<ReplaceAllBiFunctionHandler> replaceAllBiFunctionHandler;
    public final MethodOverrideHandler<ReplaceObjectObjectHandler> replaceObjectObjectHandler;
    public final MethodOverrideHandler<ReplaceObjectObjectObjectHandler> replaceObjectObjectObjectHandler;
    public final MethodOverrideHandler<SizeHandler> sizeHandler;
    public final MethodOverrideHandler<SubMapObjectObjectHandler> subMapObjectObjectHandler;
    public final MethodOverrideHandler<SubMapObjectbooleanObjectbooleanHandler> subMapObjectbooleanObjectbooleanHandler;
    public final MethodOverrideHandler<TailMapObjectHandler> tailMapObjectHandler;
    public final MethodOverrideHandler<TailMapObjectbooleanHandler> tailMapObjectbooleanHandler;
    public final MethodOverrideHandler<ToStringHandler> toStringHandler;
    public final MethodOverrideHandler<ValuesHandler> valuesHandler;

    public ParentClassWrapper() {
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
    public java.lang.String getOrDefault(java.lang.Object arg0, java.lang.String arg1) {
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
    public int hashCode() {
        return this.hashCodeHandler.getHandler().onHashCode();
    }

    @Override
    public java.lang.String toString() {
        return this.toStringHandler.getHandler().onToString();
    }

    @Override
    public int size() {
        return this.sizeHandler.getHandler().onSize();
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
    public java.lang.String get(java.lang.Object arg0) {
        return this.getObjectHandler.getHandler().onGet(arg0);
    }

    @Override
    public java.util.Comparator<? super java.lang.String> comparator() {
        return this.comparatorHandler.getHandler().onComparator();
    }

    @Override
    public java.lang.String firstKey() {
        return this.firstKeyHandler.getHandler().onFirstKey();
    }

    @Override
    public java.lang.String lastKey() {
        return this.lastKeyHandler.getHandler().onLastKey();
    }

    @Override
    public void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.String> arg0) {
        this.putAllMapHandler.getHandler().onPutAll(arg0);
    }

    @Override
    public java.lang.String put(java.lang.String arg0, java.lang.String arg1) {
        return this.putObjectObjectHandler.getHandler().onPut(arg0, arg1);
    }

    @Override
    public java.lang.String putIfAbsent(java.lang.String arg0, java.lang.String arg1) {
        return this.putIfAbsentObjectObjectHandler.getHandler().onPutIfAbsent(arg0, arg1);
    }

    @Override
    public java.lang.String computeIfAbsent(java.lang.String arg0, java.util.function.Function<? super java.lang.String, ? extends java.lang.String> arg1) {
        return this.computeIfAbsentObjectFunctionHandler.getHandler().onComputeIfAbsent(arg0, arg1);
    }

    @Override
    public java.lang.String computeIfPresent(java.lang.String arg0, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg1) {
        return this.computeIfPresentObjectBiFunctionHandler.getHandler().onComputeIfPresent(arg0, arg1);
    }

    @Override
    public java.lang.String compute(java.lang.String arg0, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg1) {
        return this.computeObjectBiFunctionHandler.getHandler().onCompute(arg0, arg1);
    }

    @Override
    public java.lang.String merge(java.lang.String arg0, java.lang.String arg1, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg2) {
        return this.mergeObjectObjectBiFunctionHandler.getHandler().onMerge(arg0, arg1, arg2);
    }

    @Override
    public java.lang.String remove(java.lang.Object arg0) {
        return this.removeObjectHandler.getHandler().onRemove(arg0);
    }

    @Override
    public void clear() {
        this.clearHandler.getHandler().onClear();
    }

    @Override
    public java.lang.Object clone() {
        return this.cloneHandler.getHandler().onClone();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> firstEntry() {
        return this.firstEntryHandler.getHandler().onFirstEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> lastEntry() {
        return this.lastEntryHandler.getHandler().onLastEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> pollFirstEntry() {
        return this.pollFirstEntryHandler.getHandler().onPollFirstEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> pollLastEntry() {
        return this.pollLastEntryHandler.getHandler().onPollLastEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> lowerEntry(java.lang.String arg0) {
        return this.lowerEntryObjectHandler.getHandler().onLowerEntry(arg0);
    }

    @Override
    public java.lang.String lowerKey(java.lang.String arg0) {
        return this.lowerKeyObjectHandler.getHandler().onLowerKey(arg0);
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> floorEntry(java.lang.String arg0) {
        return this.floorEntryObjectHandler.getHandler().onFloorEntry(arg0);
    }

    @Override
    public java.lang.String floorKey(java.lang.String arg0) {
        return this.floorKeyObjectHandler.getHandler().onFloorKey(arg0);
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> ceilingEntry(java.lang.String arg0) {
        return this.ceilingEntryObjectHandler.getHandler().onCeilingEntry(arg0);
    }

    @Override
    public java.lang.String ceilingKey(java.lang.String arg0) {
        return this.ceilingKeyObjectHandler.getHandler().onCeilingKey(arg0);
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> higherEntry(java.lang.String arg0) {
        return this.higherEntryObjectHandler.getHandler().onHigherEntry(arg0);
    }

    @Override
    public java.lang.String higherKey(java.lang.String arg0) {
        return this.higherKeyObjectHandler.getHandler().onHigherKey(arg0);
    }

    @Override
    public java.util.Set<java.lang.String> keySet() {
        return this.keySetHandler.getHandler().onKeySet();
    }

    @Override
    public java.util.NavigableSet<java.lang.String> navigableKeySet() {
        return this.navigableKeySetHandler.getHandler().onNavigableKeySet();
    }

    @Override
    public java.util.NavigableSet<java.lang.String> descendingKeySet() {
        return this.descendingKeySetHandler.getHandler().onDescendingKeySet();
    }

    @Override
    public java.util.Collection<java.lang.String> values() {
        return this.valuesHandler.getHandler().onValues();
    }

    @Override
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet() {
        return this.entrySetHandler.getHandler().onEntrySet();
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> descendingMap() {
        return this.descendingMapHandler.getHandler().onDescendingMap();
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> subMap(java.lang.String arg0, boolean arg1, java.lang.String arg2, boolean arg3) {
        return this.subMapObjectbooleanObjectbooleanHandler.getHandler().onSubMap(arg0, arg1, arg2, arg3);
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> headMap(java.lang.String arg0, boolean arg1) {
        return this.headMapObjectbooleanHandler.getHandler().onHeadMap(arg0, arg1);
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> tailMap(java.lang.String arg0, boolean arg1) {
        return this.tailMapObjectbooleanHandler.getHandler().onTailMap(arg0, arg1);
    }

    @Override
    public java.util.SortedMap<java.lang.String, java.lang.String> subMap(java.lang.String arg0, java.lang.String arg1) {
        return this.subMapObjectObjectHandler.getHandler().onSubMap(arg0, arg1);
    }

    @Override
    public java.util.SortedMap<java.lang.String, java.lang.String> headMap(java.lang.String arg0) {
        return this.headMapObjectHandler.getHandler().onHeadMap(arg0);
    }

    @Override
    public java.util.SortedMap<java.lang.String, java.lang.String> tailMap(java.lang.String arg0) {
        return this.tailMapObjectHandler.getHandler().onTailMap(arg0);
    }

    @Override
    public boolean replace(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return this.replaceObjectObjectObjectHandler.getHandler().onReplace(arg0, arg1, arg2);
    }

    @Override
    public java.lang.String replace(java.lang.String arg0, java.lang.String arg1) {
        return this.replaceObjectObjectHandler.getHandler().onReplace(arg0, arg1);
    }

    @Override
    public void forEach(java.util.function.BiConsumer<? super java.lang.String, ? super java.lang.String> arg0) {
        this.forEachBiConsumerHandler.getHandler().onForEach(arg0);
    }

    @Override
    public void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg0) {
        this.replaceAllBiFunctionHandler.getHandler().onReplaceAll(arg0);
    }

    @FunctionalInterface
    public interface CeilingEntryObjectHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onCeilingEntry(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface CeilingKeyObjectHandler {
        java.lang.String onCeilingKey(java.lang.String arg0);
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
    public interface ComparatorHandler {
        java.util.Comparator<? super java.lang.String> onComparator();
    }

    @FunctionalInterface
    public interface ComputeIfAbsentObjectFunctionHandler {
        java.lang.String onComputeIfAbsent(java.lang.String arg0, java.util.function.Function<? super java.lang.String, ? extends java.lang.String> arg1);
    }

    @FunctionalInterface
    public interface ComputeIfPresentObjectBiFunctionHandler {
        java.lang.String onComputeIfPresent(java.lang.String arg0, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg1);
    }

    @FunctionalInterface
    public interface ComputeObjectBiFunctionHandler {
        java.lang.String onCompute(java.lang.String arg0, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg1);
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
    public interface DescendingKeySetHandler {
        java.util.NavigableSet<java.lang.String> onDescendingKeySet();
    }

    @FunctionalInterface
    public interface DescendingMapHandler {
        java.util.NavigableMap<java.lang.String, java.lang.String> onDescendingMap();
    }

    @FunctionalInterface
    public interface EntrySetHandler {
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> onEntrySet();
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface FirstEntryHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onFirstEntry();
    }

    @FunctionalInterface
    public interface FirstKeyHandler {
        java.lang.String onFirstKey();
    }

    @FunctionalInterface
    public interface FloorEntryObjectHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onFloorEntry(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface FloorKeyObjectHandler {
        java.lang.String onFloorKey(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface ForEachBiConsumerHandler {
        void onForEach(java.util.function.BiConsumer<? super java.lang.String, ? super java.lang.String> arg0);
    }

    @FunctionalInterface
    public interface GetObjectHandler {
        java.lang.String onGet(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface GetOrDefaultObjectObjectHandler {
        java.lang.String onGetOrDefault(java.lang.Object arg0, java.lang.String arg1);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface HeadMapObjectHandler {
        java.util.SortedMap<java.lang.String, java.lang.String> onHeadMap(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface HeadMapObjectbooleanHandler {
        java.util.NavigableMap<java.lang.String, java.lang.String> onHeadMap(java.lang.String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface HigherEntryObjectHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onHigherEntry(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface HigherKeyObjectHandler {
        java.lang.String onHigherKey(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface KeySetHandler {
        java.util.Set<java.lang.String> onKeySet();
    }

    @FunctionalInterface
    public interface LastEntryHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onLastEntry();
    }

    @FunctionalInterface
    public interface LastKeyHandler {
        java.lang.String onLastKey();
    }

    @FunctionalInterface
    public interface LowerEntryObjectHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onLowerEntry(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface LowerKeyObjectHandler {
        java.lang.String onLowerKey(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface MergeObjectObjectBiFunctionHandler {
        java.lang.String onMerge(java.lang.String arg0, java.lang.String arg1, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg2);
    }

    @FunctionalInterface
    public interface NavigableKeySetHandler {
        java.util.NavigableSet<java.lang.String> onNavigableKeySet();
    }

    @FunctionalInterface
    public interface PollFirstEntryHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onPollFirstEntry();
    }

    @FunctionalInterface
    public interface PollLastEntryHandler {
        java.util.Map.Entry<java.lang.String, java.lang.String> onPollLastEntry();
    }

    @FunctionalInterface
    public interface PutAllMapHandler {
        void onPutAll(java.util.Map<? extends java.lang.String, ? extends java.lang.String> arg0);
    }

    @FunctionalInterface
    public interface PutIfAbsentObjectObjectHandler {
        java.lang.String onPutIfAbsent(java.lang.String arg0, java.lang.String arg1);
    }

    @FunctionalInterface
    public interface PutObjectObjectHandler {
        java.lang.String onPut(java.lang.String arg0, java.lang.String arg1);
    }

    @FunctionalInterface
    public interface RemoveObjectHandler {
        java.lang.String onRemove(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectObjectHandler {
        boolean onRemove(java.lang.Object arg0, java.lang.Object arg1);
    }

    @FunctionalInterface
    public interface ReplaceAllBiFunctionHandler {
        void onReplaceAll(java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg0);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectHandler {
        java.lang.String onReplace(java.lang.String arg0, java.lang.String arg1);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectObjectHandler {
        boolean onReplace(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2);
    }

    @FunctionalInterface
    public interface SizeHandler {
        int onSize();
    }

    @FunctionalInterface
    public interface SubMapObjectObjectHandler {
        java.util.SortedMap<java.lang.String, java.lang.String> onSubMap(java.lang.String arg0, java.lang.String arg1);
    }

    @FunctionalInterface
    public interface SubMapObjectbooleanObjectbooleanHandler {
        java.util.NavigableMap<java.lang.String, java.lang.String> onSubMap(java.lang.String arg0, boolean arg1, java.lang.String arg2, boolean arg3);
    }

    @FunctionalInterface
    public interface TailMapObjectHandler {
        java.util.SortedMap<java.lang.String, java.lang.String> onTailMap(java.lang.String arg0);
    }

    @FunctionalInterface
    public interface TailMapObjectbooleanHandler {
        java.util.NavigableMap<java.lang.String, java.lang.String> onTailMap(java.lang.String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        java.lang.String onToString();
    }

    @FunctionalInterface
    public interface ValuesHandler {
        java.util.Collection<java.lang.String> onValues();
    }

}
