package pie.ilikepiefoo.wrappergen.example;

import pie.ilikepiefoo.wrappergen.util.MethodHandler;
import pie.ilikepiefoo.wrappergen.util.MethodHotSwapHandler;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public class ParentClassWrapper extends ParentClass {
    public MethodHandler<CeilingEntryObjectHandler> ceilingEntryObjectHandler = new MethodHotSwapHandler<>(super::ceilingEntry);
    public MethodHandler<CeilingKeyObjectHandler> ceilingKeyObjectHandler = new MethodHotSwapHandler<>(super::ceilingKey);
    public MethodHandler<ClearHandler> clearHandler = new MethodHotSwapHandler<>(super::clear);
    public MethodHandler<CloneHandler> cloneHandler = new MethodHotSwapHandler<>(super::clone);
    public MethodHandler<ComparatorHandler> comparatorHandler = new MethodHotSwapHandler<>(super::comparator);
    public MethodHandler<ComputeIfAbsentObjectFunctionHandler> computeIfAbsentObjectFunctionHandler = new MethodHotSwapHandler<>(super::computeIfAbsent);
    public MethodHandler<ComputeIfPresentObjectBiFunctionHandler> computeIfPresentObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::computeIfPresent);
    public MethodHandler<ComputeObjectBiFunctionHandler> computeObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::compute);
    public MethodHandler<ContainsKeyObjectHandler> containsKeyObjectHandler = new MethodHotSwapHandler<>(super::containsKey);
    public MethodHandler<ContainsValueObjectHandler> containsValueObjectHandler = new MethodHotSwapHandler<>(super::containsValue);
    public MethodHandler<DescendingKeySetHandler> descendingKeySetHandler = new MethodHotSwapHandler<>(super::descendingKeySet);
    public MethodHandler<DescendingMapHandler> descendingMapHandler = new MethodHotSwapHandler<>(super::descendingMap);
    public MethodHandler<EntrySetHandler> entrySetHandler = new MethodHotSwapHandler<>(super::entrySet);
    public MethodHandler<EqualsObjectHandler> equalsObjectHandler = new MethodHotSwapHandler<>(super::equals);
    public MethodHandler<FirstEntryHandler> firstEntryHandler = new MethodHotSwapHandler<>(super::firstEntry);
    public MethodHandler<FirstKeyHandler> firstKeyHandler = new MethodHotSwapHandler<>(super::firstKey);
    public MethodHandler<FloorEntryObjectHandler> floorEntryObjectHandler = new MethodHotSwapHandler<>(super::floorEntry);
    public MethodHandler<FloorKeyObjectHandler> floorKeyObjectHandler = new MethodHotSwapHandler<>(super::floorKey);
    public MethodHandler<ForEachBiConsumerHandler> forEachBiConsumerHandler = new MethodHotSwapHandler<>(super::forEach);
    public MethodHandler<GetObjectHandler> getObjectHandler = new MethodHotSwapHandler<>(super::get);
    public MethodHandler<GetOrDefaultObjectObjectHandler> getOrDefaultObjectObjectHandler = new MethodHotSwapHandler<>(super::getOrDefault);
    public MethodHandler<HashCodeHandler> hashCodeHandler = new MethodHotSwapHandler<>(super::hashCode);
    public MethodHandler<HeadMapObjectBooleanHandler> headMapObjectBooleanHandler = new MethodHotSwapHandler<>(super::headMap);
    public MethodHandler<HeadMapObjectHandler> headMapObjectHandler = new MethodHotSwapHandler<>(super::headMap);
    public MethodHandler<HigherEntryObjectHandler> higherEntryObjectHandler = new MethodHotSwapHandler<>(super::higherEntry);
    public MethodHandler<HigherKeyObjectHandler> higherKeyObjectHandler = new MethodHotSwapHandler<>(super::higherKey);
    public MethodHandler<IsEmptyHandler> isEmptyHandler = new MethodHotSwapHandler<>(super::isEmpty);
    public MethodHandler<KeySetHandler> keySetHandler = new MethodHotSwapHandler<>(super::keySet);
    public MethodHandler<LastEntryHandler> lastEntryHandler = new MethodHotSwapHandler<>(super::lastEntry);
    public MethodHandler<LastKeyHandler> lastKeyHandler = new MethodHotSwapHandler<>(super::lastKey);
    public MethodHandler<LowerEntryObjectHandler> lowerEntryObjectHandler = new MethodHotSwapHandler<>(super::lowerEntry);
    public MethodHandler<LowerKeyObjectHandler> lowerKeyObjectHandler = new MethodHotSwapHandler<>(super::lowerKey);
    public MethodHandler<MergeObjectObjectBiFunctionHandler> mergeObjectObjectBiFunctionHandler = new MethodHotSwapHandler<>(super::merge);
    public MethodHandler<NavigableKeySetHandler> navigableKeySetHandler = new MethodHotSwapHandler<>(super::navigableKeySet);
    public MethodHandler<PollFirstEntryHandler> pollFirstEntryHandler = new MethodHotSwapHandler<>(super::pollFirstEntry);
    public MethodHandler<PollLastEntryHandler> pollLastEntryHandler = new MethodHotSwapHandler<>(super::pollLastEntry);
    public MethodHandler<PutAllMapHandler> putAllMapHandler = new MethodHotSwapHandler<>(super::putAll);
    public MethodHandler<PutIfAbsentObjectObjectHandler> putIfAbsentObjectObjectHandler = new MethodHotSwapHandler<>(super::putIfAbsent);
    public MethodHandler<PutObjectObjectHandler> putObjectObjectHandler = new MethodHotSwapHandler<>(super::put);
    public MethodHandler<RemoveObjectHandler> removeObjectHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<RemoveObjectObjectHandler> removeObjectObjectHandler = new MethodHotSwapHandler<>(super::remove);
    public MethodHandler<ReplaceAllBiFunctionHandler> replaceAllBiFunctionHandler = new MethodHotSwapHandler<>(super::replaceAll);
    public MethodHandler<ReplaceObjectObjectHandler> replaceObjectObjectHandler = new MethodHotSwapHandler<>(super::replace);
    public MethodHandler<ReplaceObjectObjectObjectHandler> replaceObjectObjectObjectHandler = new MethodHotSwapHandler<>(super::replace);
    public MethodHandler<SizeHandler> sizeHandler = new MethodHotSwapHandler<>(super::size);
    public MethodHandler<SubMapObjectBooleanObjectBooleanHandler> subMapObjectBooleanObjectBooleanHandler = new MethodHotSwapHandler<>(super::subMap);
    public MethodHandler<SubMapObjectObjectHandler> subMapObjectObjectHandler = new MethodHotSwapHandler<>(super::subMap);
    public MethodHandler<TailMapObjectBooleanHandler> tailMapObjectBooleanHandler = new MethodHotSwapHandler<>(super::tailMap);
    public MethodHandler<TailMapObjectHandler> tailMapObjectHandler = new MethodHotSwapHandler<>(super::tailMap);
    public MethodHandler<ToStringHandler> toStringHandler = new MethodHotSwapHandler<>(super::toString);
    public MethodHandler<ValuesHandler> valuesHandler = new MethodHotSwapHandler<>(super::values);
    public ParentClassWrapper() {
        super();
    }

    @Override
    public String getOrDefault(Object arg0, String arg1) {
        return (this.getOrDefaultObjectObjectHandler != null && this.getOrDefaultObjectObjectHandler.getHandler() != null) ? this.getOrDefaultObjectObjectHandler.getHandler().onGetOrDefault(arg0, arg1) : super.getOrDefault(arg0, arg1);
    }

    @Override
    public boolean remove(Object arg0, Object arg1) {
        return (this.removeObjectObjectHandler != null && this.removeObjectObjectHandler.getHandler() != null) ? this.removeObjectObjectHandler.getHandler().onRemove(arg0, arg1) : super.remove(arg0, arg1);
    }

    @Override
    public boolean isEmpty() {
        return (this.isEmptyHandler != null && this.isEmptyHandler.getHandler() != null) ? this.isEmptyHandler.getHandler().onIsEmpty() : super.isEmpty();
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
    public boolean containsKey(Object arg0) {
        return (this.containsKeyObjectHandler != null && this.containsKeyObjectHandler.getHandler() != null) ? this.containsKeyObjectHandler.getHandler().onContainsKey(arg0) : super.containsKey(arg0);
    }

    @Override
    public boolean containsValue(Object arg0) {
        return (this.containsValueObjectHandler != null && this.containsValueObjectHandler.getHandler() != null) ? this.containsValueObjectHandler.getHandler().onContainsValue(arg0) : super.containsValue(arg0);
    }

    @Override
    public String get(Object arg0) {
        return (this.getObjectHandler != null && this.getObjectHandler.getHandler() != null) ? this.getObjectHandler.getHandler().onGet(arg0) : super.get(arg0);
    }

    @Override
    public Comparator<? super String> comparator() {
        return (this.comparatorHandler != null && this.comparatorHandler.getHandler() != null) ? this.comparatorHandler.getHandler().onComparator() : super.comparator();
    }

    @Override
    public String firstKey() {
        return (this.firstKeyHandler != null && this.firstKeyHandler.getHandler() != null) ? this.firstKeyHandler.getHandler().onFirstKey() : super.firstKey();
    }

    @Override
    public String lastKey() {
        return (this.lastKeyHandler != null && this.lastKeyHandler.getHandler() != null) ? this.lastKeyHandler.getHandler().onLastKey() : super.lastKey();
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> arg0) {
        if (this.putAllMapHandler != null && this.putAllMapHandler.getHandler() != null) {
            this.putAllMapHandler.getHandler().onPutAll(arg0);
        } else {
            super.putAll(arg0);
        }
    }

    @Override
    public String put(String arg0, String arg1) {
        return (this.putObjectObjectHandler != null && this.putObjectObjectHandler.getHandler() != null) ? this.putObjectObjectHandler.getHandler().onPut(arg0, arg1) : super.put(arg0, arg1);
    }

    @Override
    public String putIfAbsent(String arg0, String arg1) {
        return (this.putIfAbsentObjectObjectHandler != null && this.putIfAbsentObjectObjectHandler.getHandler() != null) ? this.putIfAbsentObjectObjectHandler.getHandler().onPutIfAbsent(arg0, arg1) : super.putIfAbsent(arg0, arg1);
    }

    @Override
    public String computeIfAbsent(String arg0, Function<? super String, ? extends String> arg1) {
        return (this.computeIfAbsentObjectFunctionHandler != null && this.computeIfAbsentObjectFunctionHandler.getHandler() != null) ? this.computeIfAbsentObjectFunctionHandler.getHandler().onComputeIfAbsent(arg0, arg1) : super.computeIfAbsent(arg0, arg1);
    }

    @Override
    public String computeIfPresent(String arg0, BiFunction<? super String, ? super String, ? extends String> arg1) {
        return (this.computeIfPresentObjectBiFunctionHandler != null && this.computeIfPresentObjectBiFunctionHandler.getHandler() != null) ? this.computeIfPresentObjectBiFunctionHandler.getHandler().onComputeIfPresent(arg0, arg1) : super.computeIfPresent(arg0, arg1);
    }

    @Override
    public String compute(String arg0, BiFunction<? super String, ? super String, ? extends String> arg1) {
        return (this.computeObjectBiFunctionHandler != null && this.computeObjectBiFunctionHandler.getHandler() != null) ? this.computeObjectBiFunctionHandler.getHandler().onCompute(arg0, arg1) : super.compute(arg0, arg1);
    }

    @Override
    public String merge(String arg0, String arg1, BiFunction<? super String, ? super String, ? extends String> arg2) {
        return (this.mergeObjectObjectBiFunctionHandler != null && this.mergeObjectObjectBiFunctionHandler.getHandler() != null) ? this.mergeObjectObjectBiFunctionHandler.getHandler().onMerge(arg0, arg1, arg2) : super.merge(arg0, arg1, arg2);
    }

    @Override
    public String remove(Object arg0) {
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
    public Object clone() {
        return (this.cloneHandler != null && this.cloneHandler.getHandler() != null) ? this.cloneHandler.getHandler().onClone() : super.clone();
    }

    @Override
    public Entry<String, String> firstEntry() {
        return (this.firstEntryHandler != null && this.firstEntryHandler.getHandler() != null) ? this.firstEntryHandler.getHandler().onFirstEntry() : super.firstEntry();
    }

    @Override
    public Entry<String, String> lastEntry() {
        return (this.lastEntryHandler != null && this.lastEntryHandler.getHandler() != null) ? this.lastEntryHandler.getHandler().onLastEntry() : super.lastEntry();
    }

    @Override
    public Entry<String, String> pollFirstEntry() {
        return (this.pollFirstEntryHandler != null && this.pollFirstEntryHandler.getHandler() != null) ? this.pollFirstEntryHandler.getHandler().onPollFirstEntry() : super.pollFirstEntry();
    }

    @Override
    public Entry<String, String> pollLastEntry() {
        return (this.pollLastEntryHandler != null && this.pollLastEntryHandler.getHandler() != null) ? this.pollLastEntryHandler.getHandler().onPollLastEntry() : super.pollLastEntry();
    }

    @Override
    public Entry<String, String> lowerEntry(String arg0) {
        return (this.lowerEntryObjectHandler != null && this.lowerEntryObjectHandler.getHandler() != null) ? this.lowerEntryObjectHandler.getHandler().onLowerEntry(arg0) : super.lowerEntry(arg0);
    }

    @Override
    public String lowerKey(String arg0) {
        return (this.lowerKeyObjectHandler != null && this.lowerKeyObjectHandler.getHandler() != null) ? this.lowerKeyObjectHandler.getHandler().onLowerKey(arg0) : super.lowerKey(arg0);
    }

    @Override
    public Entry<String, String> floorEntry(String arg0) {
        return (this.floorEntryObjectHandler != null && this.floorEntryObjectHandler.getHandler() != null) ? this.floorEntryObjectHandler.getHandler().onFloorEntry(arg0) : super.floorEntry(arg0);
    }

    @Override
    public String floorKey(String arg0) {
        return (this.floorKeyObjectHandler != null && this.floorKeyObjectHandler.getHandler() != null) ? this.floorKeyObjectHandler.getHandler().onFloorKey(arg0) : super.floorKey(arg0);
    }

    @Override
    public Entry<String, String> ceilingEntry(String arg0) {
        return (this.ceilingEntryObjectHandler != null && this.ceilingEntryObjectHandler.getHandler() != null) ? this.ceilingEntryObjectHandler.getHandler().onCeilingEntry(arg0) : super.ceilingEntry(arg0);
    }

    @Override
    public String ceilingKey(String arg0) {
        return (this.ceilingKeyObjectHandler != null && this.ceilingKeyObjectHandler.getHandler() != null) ? this.ceilingKeyObjectHandler.getHandler().onCeilingKey(arg0) : super.ceilingKey(arg0);
    }

    @Override
    public Entry<String, String> higherEntry(String arg0) {
        return (this.higherEntryObjectHandler != null && this.higherEntryObjectHandler.getHandler() != null) ? this.higherEntryObjectHandler.getHandler().onHigherEntry(arg0) : super.higherEntry(arg0);
    }

    @Override
    public String higherKey(String arg0) {
        return (this.higherKeyObjectHandler != null && this.higherKeyObjectHandler.getHandler() != null) ? this.higherKeyObjectHandler.getHandler().onHigherKey(arg0) : super.higherKey(arg0);
    }

    @Override
    public Set<String> keySet() {
        return (this.keySetHandler != null && this.keySetHandler.getHandler() != null) ? this.keySetHandler.getHandler().onKeySet() : super.keySet();
    }

    @Override
    public NavigableSet<String> navigableKeySet() {
        return (this.navigableKeySetHandler != null && this.navigableKeySetHandler.getHandler() != null) ? this.navigableKeySetHandler.getHandler().onNavigableKeySet() : super.navigableKeySet();
    }

    @Override
    public NavigableSet<String> descendingKeySet() {
        return (this.descendingKeySetHandler != null && this.descendingKeySetHandler.getHandler() != null) ? this.descendingKeySetHandler.getHandler().onDescendingKeySet() : super.descendingKeySet();
    }

    @Override
    public Collection<String> values() {
        return (this.valuesHandler != null && this.valuesHandler.getHandler() != null) ? this.valuesHandler.getHandler().onValues() : super.values();
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return (this.entrySetHandler != null && this.entrySetHandler.getHandler() != null) ? this.entrySetHandler.getHandler().onEntrySet() : super.entrySet();
    }

    @Override
    public NavigableMap<String, String> descendingMap() {
        return (this.descendingMapHandler != null && this.descendingMapHandler.getHandler() != null) ? this.descendingMapHandler.getHandler().onDescendingMap() : super.descendingMap();
    }

    @Override
    public NavigableMap<String, String> subMap(String arg0, boolean arg1, String arg2, boolean arg3) {
        return (this.subMapObjectBooleanObjectBooleanHandler != null && this.subMapObjectBooleanObjectBooleanHandler.getHandler() != null) ? this.subMapObjectBooleanObjectBooleanHandler.getHandler().onSubMap(arg0, arg1, arg2, arg3) : super.subMap(arg0, arg1, arg2, arg3);
    }

    @Override
    public NavigableMap<String, String> headMap(String arg0, boolean arg1) {
        return (this.headMapObjectBooleanHandler != null && this.headMapObjectBooleanHandler.getHandler() != null) ? this.headMapObjectBooleanHandler.getHandler().onHeadMap(arg0, arg1) : super.headMap(arg0, arg1);
    }

    @Override
    public NavigableMap<String, String> tailMap(String arg0, boolean arg1) {
        return (this.tailMapObjectBooleanHandler != null && this.tailMapObjectBooleanHandler.getHandler() != null) ? this.tailMapObjectBooleanHandler.getHandler().onTailMap(arg0, arg1) : super.tailMap(arg0, arg1);
    }

    @Override
    public SortedMap<String, String> subMap(String arg0, String arg1) {
        return (this.subMapObjectObjectHandler != null && this.subMapObjectObjectHandler.getHandler() != null) ? this.subMapObjectObjectHandler.getHandler().onSubMap(arg0, arg1) : super.subMap(arg0, arg1);
    }

    @Override
    public SortedMap<String, String> headMap(String arg0) {
        return (this.headMapObjectHandler != null && this.headMapObjectHandler.getHandler() != null) ? this.headMapObjectHandler.getHandler().onHeadMap(arg0) : super.headMap(arg0);
    }

    @Override
    public SortedMap<String, String> tailMap(String arg0) {
        return (this.tailMapObjectHandler != null && this.tailMapObjectHandler.getHandler() != null) ? this.tailMapObjectHandler.getHandler().onTailMap(arg0) : super.tailMap(arg0);
    }

    @Override
    public boolean replace(String arg0, String arg1, String arg2) {
        return (this.replaceObjectObjectObjectHandler != null && this.replaceObjectObjectObjectHandler.getHandler() != null) ? this.replaceObjectObjectObjectHandler.getHandler().onReplace(arg0, arg1, arg2) : super.replace(arg0, arg1, arg2);
    }

    @Override
    public String replace(String arg0, String arg1) {
        return (this.replaceObjectObjectHandler != null && this.replaceObjectObjectHandler.getHandler() != null) ? this.replaceObjectObjectHandler.getHandler().onReplace(arg0, arg1) : super.replace(arg0, arg1);
    }

    @Override
    public void forEach(BiConsumer<? super String, ? super String> arg0) {
        if (this.forEachBiConsumerHandler != null && this.forEachBiConsumerHandler.getHandler() != null) {
            this.forEachBiConsumerHandler.getHandler().onForEach(arg0);
        } else {
            super.forEach(arg0);
        }
    }

    @Override
    public void replaceAll(BiFunction<? super String, ? super String, ? extends String> arg0) {
        if (this.replaceAllBiFunctionHandler != null && this.replaceAllBiFunctionHandler.getHandler() != null) {
            this.replaceAllBiFunctionHandler.getHandler().onReplaceAll(arg0);
        } else {
            super.replaceAll(arg0);
        }
    }
    @FunctionalInterface
    public interface CeilingEntryObjectHandler {
        Entry<String, String> onCeilingEntry(String arg0);
    }

    @FunctionalInterface
    public interface CeilingKeyObjectHandler {
        String onCeilingKey(String arg0);
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
    public interface ComparatorHandler {
        Comparator<? super String> onComparator();
    }

    @FunctionalInterface
    public interface ComputeIfAbsentObjectFunctionHandler {
        String onComputeIfAbsent(String arg0, Function<? super String, ? extends String> arg1);
    }

    @FunctionalInterface
    public interface ComputeIfPresentObjectBiFunctionHandler {
        String onComputeIfPresent(String arg0, BiFunction<? super String, ? super String, ? extends String> arg1);
    }

    @FunctionalInterface
    public interface ComputeObjectBiFunctionHandler {
        String onCompute(String arg0, BiFunction<? super String, ? super String, ? extends String> arg1);
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
    public interface DescendingKeySetHandler {
        NavigableSet<String> onDescendingKeySet();
    }

    @FunctionalInterface
    public interface DescendingMapHandler {
        NavigableMap<String, String> onDescendingMap();
    }

    @FunctionalInterface
    public interface EntrySetHandler {
        Set<Entry<String, String>> onEntrySet();
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(Object arg0);
    }

    @FunctionalInterface
    public interface FirstEntryHandler {
        Entry<String, String> onFirstEntry();
    }

    @FunctionalInterface
    public interface FirstKeyHandler {
        String onFirstKey();
    }

    @FunctionalInterface
    public interface FloorEntryObjectHandler {
        Entry<String, String> onFloorEntry(String arg0);
    }

    @FunctionalInterface
    public interface FloorKeyObjectHandler {
        String onFloorKey(String arg0);
    }

    @FunctionalInterface
    public interface ForEachBiConsumerHandler {
        void onForEach(BiConsumer<? super String, ? super String> arg0);
    }

    @FunctionalInterface
    public interface GetObjectHandler {
        String onGet(Object arg0);
    }

    @FunctionalInterface
    public interface GetOrDefaultObjectObjectHandler {
        String onGetOrDefault(Object arg0, String arg1);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface HeadMapObjectBooleanHandler {
        NavigableMap<String, String> onHeadMap(String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface HeadMapObjectHandler {
        SortedMap<String, String> onHeadMap(String arg0);
    }

    @FunctionalInterface
    public interface HigherEntryObjectHandler {
        Entry<String, String> onHigherEntry(String arg0);
    }

    @FunctionalInterface
    public interface HigherKeyObjectHandler {
        String onHigherKey(String arg0);
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface KeySetHandler {
        Set<String> onKeySet();
    }

    @FunctionalInterface
    public interface LastEntryHandler {
        Entry<String, String> onLastEntry();
    }

    @FunctionalInterface
    public interface LastKeyHandler {
        String onLastKey();
    }

    @FunctionalInterface
    public interface LowerEntryObjectHandler {
        Entry<String, String> onLowerEntry(String arg0);
    }

    @FunctionalInterface
    public interface LowerKeyObjectHandler {
        String onLowerKey(String arg0);
    }

    @FunctionalInterface
    public interface MergeObjectObjectBiFunctionHandler {
        String onMerge(String arg0, String arg1, BiFunction<? super String, ? super String, ? extends String> arg2);
    }

    @FunctionalInterface
    public interface NavigableKeySetHandler {
        NavigableSet<String> onNavigableKeySet();
    }

    @FunctionalInterface
    public interface PollFirstEntryHandler {
        Entry<String, String> onPollFirstEntry();
    }

    @FunctionalInterface
    public interface PollLastEntryHandler {
        Entry<String, String> onPollLastEntry();
    }

    @FunctionalInterface
    public interface PutAllMapHandler {
        void onPutAll(Map<? extends String, ? extends String> arg0);
    }

    @FunctionalInterface
    public interface PutIfAbsentObjectObjectHandler {
        String onPutIfAbsent(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface PutObjectObjectHandler {
        String onPut(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface RemoveObjectHandler {
        String onRemove(Object arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectObjectHandler {
        boolean onRemove(Object arg0, Object arg1);
    }

    @FunctionalInterface
    public interface ReplaceAllBiFunctionHandler {
        void onReplaceAll(BiFunction<? super String, ? super String, ? extends String> arg0);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectHandler {
        String onReplace(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectObjectHandler {
        boolean onReplace(String arg0, String arg1, String arg2);
    }

    @FunctionalInterface
    public interface SizeHandler {
        int onSize();
    }

    @FunctionalInterface
    public interface SubMapObjectBooleanObjectBooleanHandler {
        NavigableMap<String, String> onSubMap(String arg0, boolean arg1, String arg2, boolean arg3);
    }

    @FunctionalInterface
    public interface SubMapObjectObjectHandler {
        SortedMap<String, String> onSubMap(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectBooleanHandler {
        NavigableMap<String, String> onTailMap(String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectHandler {
        SortedMap<String, String> onTailMap(String arg0);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        String onToString();
    }

    @FunctionalInterface
    public interface ValuesHandler {
        Collection<String> onValues();
    }

}
