// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface BatchAddMediaItemsToAlbumRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.BatchAddMediaItemsToAlbumRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * added.
   * The maximum number of media items that can be added in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  java.util.List<java.lang.String> getMediaItemIdsList();
  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * added.
   * The maximum number of media items that can be added in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  int getMediaItemIdsCount();
  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * added.
   * The maximum number of media items that can be added in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  java.lang.String getMediaItemIds(int index);
  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * added.
   * The maximum number of media items that can be added in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  com.google.protobuf.ByteString getMediaItemIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Identifier of the [Album][google.photos.types.Album] that the
   * media items are added to.
   * </pre>
   *
   * <code>string album_id = 2;</code>
   */
  java.lang.String getAlbumId();
  /**
   *
   *
   * <pre>
   * Identifier of the [Album][google.photos.types.Album] that the
   * media items are added to.
   * </pre>
   *
   * <code>string album_id = 2;</code>
   */
  com.google.protobuf.ByteString getAlbumIdBytes();
}