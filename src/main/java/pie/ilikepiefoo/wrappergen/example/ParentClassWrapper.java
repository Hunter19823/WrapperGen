package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
public class ParentClassWrapper extends ParentClass {
    public MethodHandler<CeilingEntryObjectHandler> ceilingEntryObjectHandler;
    public MethodHandler<CeilingKeyObjectHandler> ceilingKeyObjectHandler;
    public MethodHandler<ClearHandler> clearHandler;
    public MethodHandler<CloneHandler> cloneHandler;
    public MethodHandler<ComparatorHandler> comparatorHandler;
    public MethodHandler<ComputeIfAbsentObjectFunctionHandler> computeIfAbsentObjectFunctionHandler;
    public MethodHandler<ComputeIfPresentObjectBiFunctionHandler> computeIfPresentObjectBiFunctionHandler;
    public MethodHandler<ComputeObjectBiFunctionHandler> computeObjectBiFunctionHandler;
    public MethodHandler<ContainsKeyObjectHandler> containsKeyObjectHandler;
    public MethodHandler<ContainsValueObjectHandler> containsValueObjectHandler;
    public MethodHandler<DescendingKeySetHandler> descendingKeySetHandler;
    public MethodHandler<DescendingMapHandler> descendingMapHandler;
    public MethodHandler<EntrySetHandler> entrySetHandler;
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler;
    public MethodHandler<FirstEntryHandler> firstEntryHandler;
    public MethodHandler<FirstKeyHandler> firstKeyHandler;
    public MethodHandler<FloorEntryObjectHandler> floorEntryObjectHandler;
    public MethodHandler<FloorKeyObjectHandler> floorKeyObjectHandler;
    public MethodHandler<ForEachBiConsumerHandler> forEachBiConsumerHandler;
    public MethodHandler<GetObjectHandler> getObjectHandler;
    public MethodHandler<GetOrDefaultObjectObjectHandler> getOrDefaultObjectObjectHandler;
    public MethodHandler<HashCodeHandler> hashCodeHandler;
    public MethodHandler<HeadMapObjectBooleanHandler> headMapObjectBooleanHandler;
    public MethodHandler<HeadMapObjectHandler> headMapObjectHandler;
    public MethodHandler<HigherEntryObjectHandler> higherEntryObjectHandler;
    public MethodHandler<HigherKeyObjectHandler> higherKeyObjectHandler;
    public MethodHandler<IsEmptyHandler> isEmptyHandler;
    public MethodHandler<KeySetHandler> keySetHandler;
    public MethodHandler<LastEntryHandler> lastEntryHandler;
    public MethodHandler<LastKeyHandler> lastKeyHandler;
    public MethodHandler<LowerEntryObjectHandler> lowerEntryObjectHandler;
    public MethodHandler<LowerKeyObjectHandler> lowerKeyObjectHandler;
    public MethodHandler<MergeObjectObjectBiFunctionHandler> mergeObjectObjectBiFunctionHandler;
    public MethodHandler<NavigableKeySetHandler> navigableKeySetHandler;
    public MethodHandler<PollFirstEntryHandler> pollFirstEntryHandler;
    public MethodHandler<PollLastEntryHandler> pollLastEntryHandler;
    public MethodHandler<PutAllMapHandler> putAllMapHandler;
    public MethodHandler<PutIfAbsentObjectObjectHandler> putIfAbsentObjectObjectHandler;
    public MethodHandler<PutObjectObjectHandler> putObjectObjectHandler;
    public MethodHandler<RemoveObjectHandler> removeObjectHandler;
    public MethodHandler<RemoveObjectObjectHandler> removeObjectObjectHandler;
    public MethodHandler<ReplaceAllBiFunctionHandler> replaceAllBiFunctionHandler;
    public MethodHandler<ReplaceObjectObjectHandler> replaceObjectObjectHandler;
    public MethodHandler<ReplaceObjectObjectObjectHandler> replaceObjectObjectObjectHandler;
    public MethodHandler<SizeHandler> sizeHandler;
    public MethodHandler<SubMapObjectBooleanObjectBooleanHandler> subMapObjectBooleanObjectBooleanHandler;
    public MethodHandler<SubMapObjectObjectHandler> subMapObjectObjectHandler;
    public MethodHandler<TailMapObjectBooleanHandler> tailMapObjectBooleanHandler;
    public MethodHandler<TailMapObjectHandler> tailMapObjectHandler;
    public MethodHandler<ToStringHandler> toStringHandler;
    public MethodHandler<ValuesHandler> valuesHandler;
    public ParentClassWrapper() {
        super();
    }

    @Override
    public java.lang.String getOrDefault(java.lang.Object arg0, java.lang.String arg1) {
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
    public int hashCode() {
        return (this.hashCodeHandler != null && this.hashCodeHandler.getHandler() != null) ? this.hashCodeHandler.getHandler().onHashCode() : super.hashCode();
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
    public boolean containsKey(java.lang.Object arg0) {
        return (this.containsKeyObjectHandler != null && this.containsKeyObjectHandler.getHandler() != null) ? this.containsKeyObjectHandler.getHandler().onContainsKey(arg0) : super.containsKey(arg0);
    }

    @Override
    public boolean containsValue(java.lang.Object arg0) {
        return (this.containsValueObjectHandler != null && this.containsValueObjectHandler.getHandler() != null) ? this.containsValueObjectHandler.getHandler().onContainsValue(arg0) : super.containsValue(arg0);
    }

    @Override
    public java.lang.String get(java.lang.Object arg0) {
        return (this.getObjectHandler != null && this.getObjectHandler.getHandler() != null) ? this.getObjectHandler.getHandler().onGet(arg0) : super.get(arg0);
    }

    @Override
    public java.util.Comparator<? super java.lang.String> comparator() {
        return (this.comparatorHandler != null && this.comparatorHandler.getHandler() != null) ? this.comparatorHandler.getHandler().onComparator() : super.comparator();
    }

    @Override
    public java.lang.String firstKey() {
        return (this.firstKeyHandler != null && this.firstKeyHandler.getHandler() != null) ? this.firstKeyHandler.getHandler().onFirstKey() : super.firstKey();
    }

    @Override
    public java.lang.String lastKey() {
        return (this.lastKeyHandler != null && this.lastKeyHandler.getHandler() != null) ? this.lastKeyHandler.getHandler().onLastKey() : super.lastKey();
    }

    @Override
    public void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.String> arg0) {
        if (this.putAllMapHandler != null && this.putAllMapHandler.getHandler() != null) {
            this.putAllMapHandler.getHandler().onPutAll(arg0);
        } else {
            super.putAll(arg0);
        }
    }

    @Override
    public java.lang.String put(java.lang.String arg0, java.lang.String arg1) {
        return (this.putObjectObjectHandler != null && this.putObjectObjectHandler.getHandler() != null) ? this.putObjectObjectHandler.getHandler().onPut(arg0, arg1) : super.put(arg0, arg1);
    }

    @Override
    public java.lang.String putIfAbsent(java.lang.String arg0, java.lang.String arg1) {
        return (this.putIfAbsentObjectObjectHandler != null && this.putIfAbsentObjectObjectHandler.getHandler() != null) ? this.putIfAbsentObjectObjectHandler.getHandler().onPutIfAbsent(arg0, arg1) : super.putIfAbsent(arg0, arg1);
    }

    @Override
    public java.lang.String computeIfAbsent(java.lang.String arg0, java.util.function.Function<? super java.lang.String, ? extends java.lang.String> arg1) {
        return (this.computeIfAbsentObjectFunctionHandler != null && this.computeIfAbsentObjectFunctionHandler.getHandler() != null) ? this.computeIfAbsentObjectFunctionHandler.getHandler().onComputeIfAbsent(arg0, arg1) : super.computeIfAbsent(arg0, arg1);
    }

    @Override
    public java.lang.String computeIfPresent(java.lang.String arg0, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg1) {
        return (this.computeIfPresentObjectBiFunctionHandler != null && this.computeIfPresentObjectBiFunctionHandler.getHandler() != null) ? this.computeIfPresentObjectBiFunctionHandler.getHandler().onComputeIfPresent(arg0, arg1) : super.computeIfPresent(arg0, arg1);
    }

    @Override
    public java.lang.String compute(java.lang.String arg0, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg1) {
        return (this.computeObjectBiFunctionHandler != null && this.computeObjectBiFunctionHandler.getHandler() != null) ? this.computeObjectBiFunctionHandler.getHandler().onCompute(arg0, arg1) : super.compute(arg0, arg1);
    }

    @Override
    public java.lang.String merge(java.lang.String arg0, java.lang.String arg1, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg2) {
        return (this.mergeObjectObjectBiFunctionHandler != null && this.mergeObjectObjectBiFunctionHandler.getHandler() != null) ? this.mergeObjectObjectBiFunctionHandler.getHandler().onMerge(arg0, arg1, arg2) : super.merge(arg0, arg1, arg2);
    }

    @Override
    public java.lang.String remove(java.lang.Object arg0) {
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
    public java.lang.Object clone() {
        return (this.cloneHandler != null && this.cloneHandler.getHandler() != null) ? this.cloneHandler.getHandler().onClone() : super.clone();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> firstEntry() {
        return (this.firstEntryHandler != null && this.firstEntryHandler.getHandler() != null) ? this.firstEntryHandler.getHandler().onFirstEntry() : super.firstEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> lastEntry() {
        return (this.lastEntryHandler != null && this.lastEntryHandler.getHandler() != null) ? this.lastEntryHandler.getHandler().onLastEntry() : super.lastEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> pollFirstEntry() {
        return (this.pollFirstEntryHandler != null && this.pollFirstEntryHandler.getHandler() != null) ? this.pollFirstEntryHandler.getHandler().onPollFirstEntry() : super.pollFirstEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> pollLastEntry() {
        return (this.pollLastEntryHandler != null && this.pollLastEntryHandler.getHandler() != null) ? this.pollLastEntryHandler.getHandler().onPollLastEntry() : super.pollLastEntry();
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> lowerEntry(java.lang.String arg0) {
        return (this.lowerEntryObjectHandler != null && this.lowerEntryObjectHandler.getHandler() != null) ? this.lowerEntryObjectHandler.getHandler().onLowerEntry(arg0) : super.lowerEntry(arg0);
    }

    @Override
    public java.lang.String lowerKey(java.lang.String arg0) {
        return (this.lowerKeyObjectHandler != null && this.lowerKeyObjectHandler.getHandler() != null) ? this.lowerKeyObjectHandler.getHandler().onLowerKey(arg0) : super.lowerKey(arg0);
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> floorEntry(java.lang.String arg0) {
        return (this.floorEntryObjectHandler != null && this.floorEntryObjectHandler.getHandler() != null) ? this.floorEntryObjectHandler.getHandler().onFloorEntry(arg0) : super.floorEntry(arg0);
    }

    @Override
    public java.lang.String floorKey(java.lang.String arg0) {
        return (this.floorKeyObjectHandler != null && this.floorKeyObjectHandler.getHandler() != null) ? this.floorKeyObjectHandler.getHandler().onFloorKey(arg0) : super.floorKey(arg0);
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> ceilingEntry(java.lang.String arg0) {
        return (this.ceilingEntryObjectHandler != null && this.ceilingEntryObjectHandler.getHandler() != null) ? this.ceilingEntryObjectHandler.getHandler().onCeilingEntry(arg0) : super.ceilingEntry(arg0);
    }

    @Override
    public java.lang.String ceilingKey(java.lang.String arg0) {
        return (this.ceilingKeyObjectHandler != null && this.ceilingKeyObjectHandler.getHandler() != null) ? this.ceilingKeyObjectHandler.getHandler().onCeilingKey(arg0) : super.ceilingKey(arg0);
    }

    @Override
    public java.util.Map.Entry<java.lang.String, java.lang.String> higherEntry(java.lang.String arg0) {
        return (this.higherEntryObjectHandler != null && this.higherEntryObjectHandler.getHandler() != null) ? this.higherEntryObjectHandler.getHandler().onHigherEntry(arg0) : super.higherEntry(arg0);
    }

    @Override
    public java.lang.String higherKey(java.lang.String arg0) {
        return (this.higherKeyObjectHandler != null && this.higherKeyObjectHandler.getHandler() != null) ? this.higherKeyObjectHandler.getHandler().onHigherKey(arg0) : super.higherKey(arg0);
    }

    @Override
    public java.util.Set<java.lang.String> keySet() {
        return (this.keySetHandler != null && this.keySetHandler.getHandler() != null) ? this.keySetHandler.getHandler().onKeySet() : super.keySet();
    }

    @Override
    public java.util.NavigableSet<java.lang.String> navigableKeySet() {
        return (this.navigableKeySetHandler != null && this.navigableKeySetHandler.getHandler() != null) ? this.navigableKeySetHandler.getHandler().onNavigableKeySet() : super.navigableKeySet();
    }

    @Override
    public java.util.NavigableSet<java.lang.String> descendingKeySet() {
        return (this.descendingKeySetHandler != null && this.descendingKeySetHandler.getHandler() != null) ? this.descendingKeySetHandler.getHandler().onDescendingKeySet() : super.descendingKeySet();
    }

    @Override
    public java.util.Collection<java.lang.String> values() {
        return (this.valuesHandler != null && this.valuesHandler.getHandler() != null) ? this.valuesHandler.getHandler().onValues() : super.values();
    }

    @Override
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet() {
        return (this.entrySetHandler != null && this.entrySetHandler.getHandler() != null) ? this.entrySetHandler.getHandler().onEntrySet() : super.entrySet();
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> descendingMap() {
        return (this.descendingMapHandler != null && this.descendingMapHandler.getHandler() != null) ? this.descendingMapHandler.getHandler().onDescendingMap() : super.descendingMap();
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> subMap(java.lang.String arg0, boolean arg1, java.lang.String arg2, boolean arg3) {
        return (this.subMapObjectBooleanObjectBooleanHandler != null && this.subMapObjectBooleanObjectBooleanHandler.getHandler() != null) ? this.subMapObjectBooleanObjectBooleanHandler.getHandler().onSubMap(arg0, arg1, arg2, arg3) : super.subMap(arg0, arg1, arg2, arg3);
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> headMap(java.lang.String arg0, boolean arg1) {
        return (this.headMapObjectBooleanHandler != null && this.headMapObjectBooleanHandler.getHandler() != null) ? this.headMapObjectBooleanHandler.getHandler().onHeadMap(arg0, arg1) : super.headMap(arg0, arg1);
    }

    @Override
    public java.util.NavigableMap<java.lang.String, java.lang.String> tailMap(java.lang.String arg0, boolean arg1) {
        return (this.tailMapObjectBooleanHandler != null && this.tailMapObjectBooleanHandler.getHandler() != null) ? this.tailMapObjectBooleanHandler.getHandler().onTailMap(arg0, arg1) : super.tailMap(arg0, arg1);
    }

    @Override
    public java.util.SortedMap<java.lang.String, java.lang.String> subMap(java.lang.String arg0, java.lang.String arg1) {
        return (this.subMapObjectObjectHandler != null && this.subMapObjectObjectHandler.getHandler() != null) ? this.subMapObjectObjectHandler.getHandler().onSubMap(arg0, arg1) : super.subMap(arg0, arg1);
    }

    @Override
    public java.util.SortedMap<java.lang.String, java.lang.String> headMap(java.lang.String arg0) {
        return (this.headMapObjectHandler != null && this.headMapObjectHandler.getHandler() != null) ? this.headMapObjectHandler.getHandler().onHeadMap(arg0) : super.headMap(arg0);
    }

    @Override
    public java.util.SortedMap<java.lang.String, java.lang.String> tailMap(java.lang.String arg0) {
        return (this.tailMapObjectHandler != null && this.tailMapObjectHandler.getHandler() != null) ? this.tailMapObjectHandler.getHandler().onTailMap(arg0) : super.tailMap(arg0);
    }

    @Override
    public boolean replace(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return (this.replaceObjectObjectObjectHandler != null && this.replaceObjectObjectObjectHandler.getHandler() != null) ? this.replaceObjectObjectObjectHandler.getHandler().onReplace(arg0, arg1, arg2) : super.replace(arg0, arg1, arg2);
    }

    @Override
    public java.lang.String replace(java.lang.String arg0, java.lang.String arg1) {
        return (this.replaceObjectObjectHandler != null && this.replaceObjectObjectHandler.getHandler() != null) ? this.replaceObjectObjectHandler.getHandler().onReplace(arg0, arg1) : super.replace(arg0, arg1);
    }

    @Override
    public void forEach(java.util.function.BiConsumer<? super java.lang.String, ? super java.lang.String> arg0) {
        if (this.forEachBiConsumerHandler != null && this.forEachBiConsumerHandler.getHandler() != null) {
            this.forEachBiConsumerHandler.getHandler().onForEach(arg0);
        } else {
            super.forEach(arg0);
        }
    }

    @Override
    public void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super java.lang.String, ? extends java.lang.String> arg0) {
        if (this.replaceAllBiFunctionHandler != null && this.replaceAllBiFunctionHandler.getHandler() != null) {
            this.replaceAllBiFunctionHandler.getHandler().onReplaceAll(arg0);
        } else {
            super.replaceAll(arg0);
        }
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
    public interface HeadMapObjectBooleanHandler {
        java.util.NavigableMap<java.lang.String, java.lang.String> onHeadMap(java.lang.String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface HeadMapObjectHandler {
        java.util.SortedMap<java.lang.String, java.lang.String> onHeadMap(java.lang.String arg0);
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
    public interface SubMapObjectBooleanObjectBooleanHandler {
        java.util.NavigableMap<java.lang.String, java.lang.String> onSubMap(java.lang.String arg0, boolean arg1, java.lang.String arg2, boolean arg3);
    }

    @FunctionalInterface
    public interface SubMapObjectObjectHandler {
        java.util.SortedMap<java.lang.String, java.lang.String> onSubMap(java.lang.String arg0, java.lang.String arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectBooleanHandler {
        java.util.NavigableMap<java.lang.String, java.lang.String> onTailMap(java.lang.String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectHandler {
        java.util.SortedMap<java.lang.String, java.lang.String> onTailMap(java.lang.String arg0);
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
