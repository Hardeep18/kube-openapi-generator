# coding: utf-8

# flake8: noqa
"""
    stash-server

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into model package
from swagger_client.models.com_github_appscode_stash_apis_repositories_v1alpha1_snapshot import ComGithubAppscodeStashApisRepositoriesV1alpha1Snapshot
from swagger_client.models.com_github_appscode_stash_apis_repositories_v1alpha1_snapshot_list import ComGithubAppscodeStashApisRepositoriesV1alpha1SnapshotList
from swagger_client.models.com_github_appscode_stash_apis_repositories_v1alpha1_snapshot_status import ComGithubAppscodeStashApisRepositoriesV1alpha1SnapshotStatus
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_azure_spec import ComGithubAppscodeStashApisStashV1alpha1AzureSpec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_b2_spec import ComGithubAppscodeStashApisStashV1alpha1B2Spec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_backend import ComGithubAppscodeStashApisStashV1alpha1Backend
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_file_group import ComGithubAppscodeStashApisStashV1alpha1FileGroup
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_gcs_spec import ComGithubAppscodeStashApisStashV1alpha1GCSSpec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_local_spec import ComGithubAppscodeStashApisStashV1alpha1LocalSpec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_local_typed_reference import ComGithubAppscodeStashApisStashV1alpha1LocalTypedReference
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_recovery import ComGithubAppscodeStashApisStashV1alpha1Recovery
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_recovery_list import ComGithubAppscodeStashApisStashV1alpha1RecoveryList
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_recovery_spec import ComGithubAppscodeStashApisStashV1alpha1RecoverySpec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_recovery_status import ComGithubAppscodeStashApisStashV1alpha1RecoveryStatus
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_repository import ComGithubAppscodeStashApisStashV1alpha1Repository
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_repository_list import ComGithubAppscodeStashApisStashV1alpha1RepositoryList
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_repository_spec import ComGithubAppscodeStashApisStashV1alpha1RepositorySpec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_repository_status import ComGithubAppscodeStashApisStashV1alpha1RepositoryStatus
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_restic import ComGithubAppscodeStashApisStashV1alpha1Restic
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_restic_list import ComGithubAppscodeStashApisStashV1alpha1ResticList
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_restic_spec import ComGithubAppscodeStashApisStashV1alpha1ResticSpec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_restore_stats import ComGithubAppscodeStashApisStashV1alpha1RestoreStats
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_retention_policy import ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_s3_spec import ComGithubAppscodeStashApisStashV1alpha1S3Spec
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_swift_spec import ComGithubAppscodeStashApisStashV1alpha1SwiftSpec
from swagger_client.models.io_k8s_api_core_v1_aws_elastic_block_store_volume_source import IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource
from swagger_client.models.io_k8s_api_core_v1_azure_disk_volume_source import IoK8sApiCoreV1AzureDiskVolumeSource
from swagger_client.models.io_k8s_api_core_v1_azure_file_volume_source import IoK8sApiCoreV1AzureFileVolumeSource
from swagger_client.models.io_k8s_api_core_v1_ceph_fs_volume_source import IoK8sApiCoreV1CephFSVolumeSource
from swagger_client.models.io_k8s_api_core_v1_cinder_volume_source import IoK8sApiCoreV1CinderVolumeSource
from swagger_client.models.io_k8s_api_core_v1_config_map_projection import IoK8sApiCoreV1ConfigMapProjection
from swagger_client.models.io_k8s_api_core_v1_config_map_volume_source import IoK8sApiCoreV1ConfigMapVolumeSource
from swagger_client.models.io_k8s_api_core_v1_downward_api_projection import IoK8sApiCoreV1DownwardAPIProjection
from swagger_client.models.io_k8s_api_core_v1_downward_api_volume_file import IoK8sApiCoreV1DownwardAPIVolumeFile
from swagger_client.models.io_k8s_api_core_v1_downward_api_volume_source import IoK8sApiCoreV1DownwardAPIVolumeSource
from swagger_client.models.io_k8s_api_core_v1_empty_dir_volume_source import IoK8sApiCoreV1EmptyDirVolumeSource
from swagger_client.models.io_k8s_api_core_v1_fc_volume_source import IoK8sApiCoreV1FCVolumeSource
from swagger_client.models.io_k8s_api_core_v1_flex_volume_source import IoK8sApiCoreV1FlexVolumeSource
from swagger_client.models.io_k8s_api_core_v1_flocker_volume_source import IoK8sApiCoreV1FlockerVolumeSource
from swagger_client.models.io_k8s_api_core_v1_gce_persistent_disk_volume_source import IoK8sApiCoreV1GCEPersistentDiskVolumeSource
from swagger_client.models.io_k8s_api_core_v1_git_repo_volume_source import IoK8sApiCoreV1GitRepoVolumeSource
from swagger_client.models.io_k8s_api_core_v1_glusterfs_volume_source import IoK8sApiCoreV1GlusterfsVolumeSource
from swagger_client.models.io_k8s_api_core_v1_host_path_volume_source import IoK8sApiCoreV1HostPathVolumeSource
from swagger_client.models.io_k8s_api_core_v1_iscsi_volume_source import IoK8sApiCoreV1ISCSIVolumeSource
from swagger_client.models.io_k8s_api_core_v1_key_to_path import IoK8sApiCoreV1KeyToPath
from swagger_client.models.io_k8s_api_core_v1_local_object_reference import IoK8sApiCoreV1LocalObjectReference
from swagger_client.models.io_k8s_api_core_v1_nfs_volume_source import IoK8sApiCoreV1NFSVolumeSource
from swagger_client.models.io_k8s_api_core_v1_object_field_selector import IoK8sApiCoreV1ObjectFieldSelector
from swagger_client.models.io_k8s_api_core_v1_persistent_volume_claim_volume_source import IoK8sApiCoreV1PersistentVolumeClaimVolumeSource
from swagger_client.models.io_k8s_api_core_v1_photon_persistent_disk_volume_source import IoK8sApiCoreV1PhotonPersistentDiskVolumeSource
from swagger_client.models.io_k8s_api_core_v1_portworx_volume_source import IoK8sApiCoreV1PortworxVolumeSource
from swagger_client.models.io_k8s_api_core_v1_projected_volume_source import IoK8sApiCoreV1ProjectedVolumeSource
from swagger_client.models.io_k8s_api_core_v1_quobyte_volume_source import IoK8sApiCoreV1QuobyteVolumeSource
from swagger_client.models.io_k8s_api_core_v1_rbd_volume_source import IoK8sApiCoreV1RBDVolumeSource
from swagger_client.models.io_k8s_api_core_v1_resource_field_selector import IoK8sApiCoreV1ResourceFieldSelector
from swagger_client.models.io_k8s_api_core_v1_resource_requirements import IoK8sApiCoreV1ResourceRequirements
from swagger_client.models.io_k8s_api_core_v1_scale_io_volume_source import IoK8sApiCoreV1ScaleIOVolumeSource
from swagger_client.models.io_k8s_api_core_v1_secret_projection import IoK8sApiCoreV1SecretProjection
from swagger_client.models.io_k8s_api_core_v1_secret_volume_source import IoK8sApiCoreV1SecretVolumeSource
from swagger_client.models.io_k8s_api_core_v1_storage_os_volume_source import IoK8sApiCoreV1StorageOSVolumeSource
from swagger_client.models.io_k8s_api_core_v1_volume_mount import IoK8sApiCoreV1VolumeMount
from swagger_client.models.io_k8s_api_core_v1_volume_projection import IoK8sApiCoreV1VolumeProjection
from swagger_client.models.io_k8s_api_core_v1_vsphere_virtual_disk_volume_source import IoK8sApiCoreV1VsphereVirtualDiskVolumeSource
from swagger_client.models.io_k8s_apimachinery_pkg_api_resource_quantity import IoK8sApimachineryPkgApiResourceQuantity
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_api_group import IoK8sApimachineryPkgApisMetaV1APIGroup
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_api_group_list import IoK8sApimachineryPkgApisMetaV1APIGroupList
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_api_resource import IoK8sApimachineryPkgApisMetaV1APIResource
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_api_resource_list import IoK8sApimachineryPkgApisMetaV1APIResourceList
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_delete_options import IoK8sApimachineryPkgApisMetaV1DeleteOptions
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_group_version_for_discovery import IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_initializer import IoK8sApimachineryPkgApisMetaV1Initializer
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_initializers import IoK8sApimachineryPkgApisMetaV1Initializers
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_label_selector import IoK8sApimachineryPkgApisMetaV1LabelSelector
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_label_selector_requirement import IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_list_meta import IoK8sApimachineryPkgApisMetaV1ListMeta
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_object_meta import IoK8sApimachineryPkgApisMetaV1ObjectMeta
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_owner_reference import IoK8sApimachineryPkgApisMetaV1OwnerReference
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_patch import IoK8sApimachineryPkgApisMetaV1Patch
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_preconditions import IoK8sApimachineryPkgApisMetaV1Preconditions
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_server_address_by_client_cidr import IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_status import IoK8sApimachineryPkgApisMetaV1Status
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_status_cause import IoK8sApimachineryPkgApisMetaV1StatusCause
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_status_details import IoK8sApimachineryPkgApisMetaV1StatusDetails
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_time import IoK8sApimachineryPkgApisMetaV1Time
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_watch_event import IoK8sApimachineryPkgApisMetaV1WatchEvent
from swagger_client.models.io_k8s_apimachinery_pkg_runtime_raw_extension import IoK8sApimachineryPkgRuntimeRawExtension
